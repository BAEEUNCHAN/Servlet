/**
 * json1
 */
document.querySelector('div.container-fluid>div:nth-of-type(2)').remove();
document.querySelector('div.container-fluid>table').remove();


//json문자열
//자바스크립트 객체 {속성: 값,속성:값......} new Object();
let obj = { name: '김감치', age: 90, pets: [
	{name: '양옹이', age: 3 },
	{name: '멍멍이', age: 2 },
	]
}; //> {"name":"김감치","age":20}
let json = JSON.stringify(obj);
console.log(obj);

obj = JSON.parse(json);
console.log(obj);