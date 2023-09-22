// var figlet = require("figlet");
// // require : 요구하다 - figlet이라는 모듈을 요구한다
// // figlet이라는 변수에 모듈을 가져와 저장 => 변수를 통해 사용할 수 있음
// figlet("JiYoung!", function (err, data) {
//     if (err) {
//         console.log("Something went wrong...");
//         console.dir(err);
//         return;
//     }
//     console.log(data);
// });

const express = require('express'); // express서버가
const app = express();  // 실행이 되어 app 변수에 넣음
var cors = require('cors');
const port = 3000;

app.use(cors()); // 서버에 사용하겠다 선언 ()안에 넣으면 조건을 설정할 수 있고 비워놓으면 모든 요청에 허용하겠다는 뜻

// Http메소드, 라우팅, 콜백 함수(()=>{})
// => get메소드로 들어온 것을 받겠다!
// => 특정 포트 안에서 여러 파일이 있는데 이러한 것(ex. youtube.com/feed/..., youtube.com/channel/dfef...)
//      라우팅에 따라 보여지는 페이지가 달라짐
// => req, res = request, response
//  콜백함수 : 함수(끝나고 실행할 함수)
app.get('/', function (req, res) {
    res.send('Hello World')
    // => 응답에 'Hello World'를 보내겠다!
})
// => 3000포트로 들어갔음(get방식으로 '/'(루트)에 들어감)
//   => 콜백함수 실행됨 : 응답에 글자를 보내겠다! => 글자가 출력됨

// app.get('/dog', function (req, res) {
//     // res.send({'sound' : '멍멍'})
//     res.json({'sound' : '멍멍'})
//     // send 함수에 자바스크립트 오브젝트 자료형(json은 아니지만)을 넣음
// })
// app.get('/cat', function (req, res) {
//     // res.send('고양이')
//     res.json({'sound' : '야옹'})
// })
//
// // 파라미터로 받기 : 뒤에 파라미터 작성
// app.get('/user/:id', function (req, res) {
//     // const q = req.params;   // :을 쓰고 뒤에 뭘 쓰면 그게 req.params로 들어온다!
//     // console.log(q);
//     // // => 주소창에 localhost:3000/user/jiyoung 이라고 치면
//     // //      console에 { id: 'jiyoung' }이라고 출력됨
//     // res.json({'userid' : q.id});
//     // => 화면에 {"userid": "jiyoung"} 이 출력됨
//
//     // query로 받기
//     const q = req.query;
//     console.log(q);
//     // { q: 'jiyoung', name: 'jiyoung', age: '30' } 출력됨
//     console.log(q.q);
//     console.log(q.name);
//     res.json({'userid' : q.name});
//
// })
//
// // POST 방식 : params, body
// app.use(express.json());
// app.post('/user/:id', (req, res) => {
//     const p = req.params;
//     console.log(p);
//     const b= req.body;
//     console.log(b);
//
//     res.send({'message' : 'Hello World!'});
// });

app.get('/sound/:name', (req, res) => {
    // const p = req.params;
    // p.name; => 이걸 한번에 하기!
    const { name } = req.params; // 오른쪽이 json데이터이기 때문에 중괄호 안에 key값을 입력하여 사용가능!
    // {name:'dog'}에서 dog가 바로 들어감(중괄호를 같게 맞춰주고 key값을 입력하면 바로 값이 들어감)
    console.log(name);
    // =>주소에 http://localhost:3000/sound/dog를 입력하면 콘솔에 dog가 출력됨

    if(name == "dog") {
        res.json({'sound' : '멍멍'});
    } else if(name == "cat") {
        res.json({'sound' : '야옹'});
    } else if(name =="pig") {
        res.json({'sound' : '꿀꿀'});
    } else {
        res.json({'sound' : '알수없음'});
    }

});


// port : 배와 선착장의 개념 - 들어올 수 있는 입구(usb포트, 서버 포트 등)
//      요청을 할때 서버에 들어갈 때 특정 포트로 들어가는
//      naver.com == naver.com:443(https 포트번호)
//      포트마다 다른 프로그램 실행가능 => 한 서버에 여러 프로그램 실행가능
// app.listen(port, () => {}) : 몇번 포트를 듣고있다. (): 함수
//      ${port}에서 듣고있습니다 라고 터미널에 출력하라는 함수
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
});
