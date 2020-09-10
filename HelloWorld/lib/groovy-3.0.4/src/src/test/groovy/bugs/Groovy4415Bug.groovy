/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package groovy.bugs

import groovy.test.GroovyTestCase

class Groovy4415Bug extends GroovyTestCase {
    void testCompilerShouldFindMethod() {
        // interface defined in Groovy
        assertScript '''
            public interface MyInterface<T> { T getId() }
            public class A implements MyInterface<Long> {
                Long id
            }
            def o = new A(id:666)
            assert o.id == 666
        '''

        // the bug report is when the interface is written in Java
        assertScript '''
            public class A implements groovy.bugs.Groovy4415BugSupport<Long> {
                Long id
            }
            def o = new A(id:666)
            assert o.id == 666
        '''
    }

    void testGroovy4645() {
        assertScript '''
            interface CovariantReturns {
                Foo getGood()

                Object getBad()
            }

            class Foo {}

            class CovariantReturnsImpl implements CovariantReturns {
                //getter is generated by groovy as required by the interface
                final Foo good

                //this variable is defined as the subtype of Object
                final Foo bad
            
                /*
                I would expect that the following method would be generated by groovy
                which is using Java's covariant returns feature.  Including the method below
                will allow the groovy compiler to succeed but is annoying that it has to be explicitly
                defined in code.

                public Foo getBad() { return bad }
                */
            }
            new CovariantReturnsImpl()
        '''
    }
}

