function onLoad() {
    hw();
    //加減乘除
    var i = 3;
    var j = 5;

    function func1(i, j) {
        console.log(i);
        console.log(j);
        // return 0
    }

    func1(i, j);  //調用

    function add(i, j) {
        console.log(i + j);
    }

    add(5, 4);

    function sub(i, j) {
        console.log(i - j);
    }

    sub(5, 4);

    function sum(i, j) {
        console.log(i * j);
    }

    sum(5, 4);

    function div(i, j) {
        console.log(i / j);
    }

    div(5, 4);

    // var obj = new Object();
    var obj={};
    obj.id = 1;
    obj.name = 'john';
    var obj2 = {
        id: 1,
        name: 'steve'
    }
    console.log(obj2);
    var obj3 = obj2;
    obj3.id = 100;
    console.log(obj2);
    console.log(obj3);
    var i = 3;
    var j = i;
    j += 100;
    console.log(i);
    console.log(j);

    function function2(obj) {
        obj.id += 10
        console.log(obj);
    }

    function2(obj2);

    var button = document.getElementById('button');
    button.addEventListener('click', clickEvent);
    // button.addEventListener('click',function (ev) {
    //     var input=document.getElementById('id1');
    //     alert(input.value);
    // });

    function clickEvent() {
        var input = document.getElementById('id1');
        if (input.value === '') {
            input.value = 'type something';
            input.style.borderColor = 'red'

        } else {
            input.style.borderColor = '';
            alert(input.value);
            input.style.display = 'none';
        }
        var container = document.getElementById('container');
        var div = document.createElement('div');
        div.innerHTML = 'test';
        container.appendChild(div);

    }


}