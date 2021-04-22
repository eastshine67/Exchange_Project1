# Exchange_Project1

class list:

Main: ProcessingClass의 exchangeConverter 메서드 호출(Main 클래스에서 최종 run)

ProcessingClass: 환전 시스템 전체를 구동시킴

ValueClass: 상수인 변수값(환율, 환전대상 화폐이름)을 모음

PrintClass: 환전 시스템 출력에 관한 메서드를 모아두며 거스름돈 결과값 출력기능을 담당

InputFromConsoleClass: Main 클래스를 실행시켰을 때 사용자가 입력하는 값(환전할 금액, 환전대상) Scanner로 실행

ExchangeType: 조건에 따라 변하는 변수값 모음(환전할 금액, 환전결과(USD), 환전결과(EUR), 환전결과(JPY), 거스름돈)

FileWriterClass: 파일 편집 및 생성하는 기능의 FileWriter 클래스를 이용하여 환전결과값과 날짜 등을 csv파일로 정리 및 생성