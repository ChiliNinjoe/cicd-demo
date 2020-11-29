package codes.recursive

import io.micronaut.test.annotation.MicronautTest

@MicronautTest
class HelloWorldSpec extends AbstractSpec {

    def "test hello world"() {
        def foo = 'bar'
        when:
        foo == 'bar'
        then:
        foo.reverse() == 'rab'
    }

}