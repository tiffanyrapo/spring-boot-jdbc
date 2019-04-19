function hw() {
    console.log('hw');
    var button = document.getElementById('check');
    console.log(button)
    /**
     *
     1.設計一表單，3-4個欄位，
     >form是表單 div欄位 input
     2.設計1 button 按下button取得欄位資料
     > button addEventListener check，input.value getElementById
     3.設計一個物件 依欄位放欄位資料 >
     var obj2 = {
		              id: 1,
		              name: 'steve'
		            }
     4.印出物件
     > console.log(obj)
     */
     var button = document.getElementById('check');
     button.addEventListener('click', clickEvent);

     var form = {
         name: 'Yang' ,
         id: 19322254 ,
         phone: 0985655477
     }
     function cilkEvent()
}