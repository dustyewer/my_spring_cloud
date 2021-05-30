# 工程简介



# 例子
    @RestControllerAdvice
    public class MyExceptionHandler {
        @ExceptionHandler
        public String exceptionHandler(Exception exception){
            System.out.println(exception);
            return "exp";
        }
    }

同一个ControllerAdvice 里面按异常的匹配度来选择方法执行
想控制顺序可以添加多个ControllerAdvice,使用@Order控制
