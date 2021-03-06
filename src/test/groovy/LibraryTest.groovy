/*
 * This Spock specification was generated by the Gradle 'init' task.
 */

import com.clover.test.basedrop.HelloSayer
import spock.lang.Specification

class LibraryTest extends Specification {
    def "hello says hello"() {
        setup:
        def lib = new HelloSayer()

        when:
        def word = lib.say()

        then:
        word == "Hello"
    }
}
