/**
 * basic
 */
console.log("basic.js");

let name = "김감치";
let address = "대구 수성구";
let age = 31;

//const myInfo = {name: name , address:address , age:age}
const myInfoAry = [name, address, age];


//createElement('span')=><span></span>
//innerText/innerHTML = 값.
//부모.appendChild(자식) => <부모><자식/></부모>

makeDom();
function makeDom() {
	// for.. in.. 
	myInfoAry.forEach(function(prop) {
		let span = document.createElement('span')
		span.innerHTML = myInfo[prop] + ' ';
		document.getElementById('show').appendChild(span);

		console.log(span);
	}
	};

for (let prop in myInfo) {

	let span = document.createElement('span')
	span.innerHTML = myInfo[prop] + ' ';
	document.getElementById('show').appendChild(span);

	console.log(span);
}


console.log(`이름은 ${name}이고 주소는 ${address}임 ${age > 20 ? '얼은' : '안얼은'}`);
name = 20;
console.log(typeof name);

const obj = {
	name1: "김감치",
	age: 20,
	myInfo: function() {
		return this.name1 + ', ' + this.age;
	}
};

console.log(`이름은 ${obj.name}, 나이는 ${obj['age']}`);
console.log(obj.myInfo());

for (let prop in obj) {
	console.log(`속성은 ${prop}이고 값은 ${obj[prop]}`);
}
const ary = [1, 2, 3];
ary.push(4);
ary.unshift(5);

for (let num of ary) {
	console.log(`값은${num}임`)
}

ary.forEach(function(item, idx, ary) {
	if (idx == 0 || idx == ary.length - 1) {
		console.log(item);
	}
});

const friends = [
	{ name: "김감치", address: "대구 수성구", height: 167 },
	{ name: "김삼치", address: "대구 중구", height: 183 },
	{ name: "김사치", address: "대구 동구", height: 178 }
]

friends.forEach(function(friend) {
	//friend정보를 한건씩 반복.
	for (let prop in friend) {
		console.log(prop + ', ' + friend[prop]);
	}
	console.log('---------------------')
});

























