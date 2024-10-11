package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Method[] declaredMethods = Service.class.getMethods();
		
		for(Method method : declaredMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation
			(PrintAnnotation.class);
			  if (printAnnotation != null) {
                printLine(printAnnotation);  // 어노테이션 값 출력
                method.invoke(new Service());  // 메소드 실행 (인자 없음)
                printLine(printAnnotation);  // 어노테이션 값 출력
            }
		}
	}

//	private static void printLine(PrintAnnotation printAnnotation) {
//	
//		if(printAnnotation != null) {
//			int number = printAnnotation.number();
//			for(int i = 0; i < number; i++) {
//				String value = printAnnotation.value();
//				System.out.print(value);
//			}
//			System.out.println();
//		}
//	}
//  private static void printLine(PrintAnnotation printAnnotation) {
//	  
//	  if (printAnnotation != null) {
//	      int number = printAnnotation.number();
//	      for (int i = 0; i < number; i++) {
//	          String value = printAnnotation.value();
//	          System.out.print(value);
//	      }
//	      System.out.println();
//	  }
//  
//  }
//}


//package ch12.sec12;
//
//import java.lang.reflect.Method;
//
//public class PrintAnnotationExample {
//    public static void main(String[] args) throws Exception {
//        // Service 클래스의 모든 메소드 가져오기
//        Method[] declaredMethods = Service.class.getDeclaredMethods();  // Service 클래스의 메소드만 가져오기
//
//        for (Method method : declaredMethods) {
//            // 메소드에 붙은 PrintAnnotation 어노테이션 확인
//            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
//
//            // PrintAnnotation이 있는 경우에만 처리
//            if (printAnnotation != null) {
//                printLine(printAnnotation);  // 어노테이션 값 출력
//                method.invoke(new Service());  // 메소드 실행 (인자 없음)
//                printLine(printAnnotation);  // 어노테이션 값 출력
//            }
//        }
//    }
//
	
	
	
    private static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }}
//}
