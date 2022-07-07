package first.app

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class StudentServiceSpec extends Specification implements ServiceUnitTest<StudentService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
