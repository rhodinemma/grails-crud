package first.app

class StudentController {

    def studentService

    def index() {
        respond studentService.list()
    }

    def show(Long id){
        respond studentService.get(id)
    }

    def create(){
        respond new Student(params)
    }

    def save(Student student){
        studentService.save(student)
        redirect action:"index", method:"GET"
    }

    def delete(Long id){
        studentService.delete(id)
        redirect action:"index", method:"GET"
    }
}
