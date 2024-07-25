/**
 * json2.js
 */
document.querySelector('div.container-fluid>div:nth-of-type(2)').remove();
document.querySelector('div.container-fluid>table').remove();

let json = `[{"id":1,"first_name":"Franz","last_name":"Nisuis","email":"fnisuis0@jalbum.net","gender":"Male","salary":5997},
{"id":2,"first_name":"Esra","last_name":"Matushenko","email":"ematushenko1@ning.com","gender":"Male","salary":8419},
{"id":3,"first_name":"Bobbie","last_name":"Ride","email":"bride2@apache.org","gender":"Female","salary":8432},
{"id":4,"first_name":"Zeke","last_name":"Russan","email":"zrussan3@eventbrite.com","gender":"Male","salary":6188},
{"id":5,"first_name":"Elihu","last_name":"Gwilliams","email":"egwilliams4@hexun.com","gender":"Male","salary":1268},
{"id":6,"first_name":"Roy","last_name":"Tebboth","email":"rtebboth5@mail.ru","gender":"Male","salary":7889},
{"id":7,"first_name":"Vicky","last_name":"Tobin","email":"vtobin6@ezinearticles.com","gender":"Female","salary":7644},
{"id":8,"first_name":"Mela","last_name":"Reynault","email":"mreynault7@shareasale.com","gender":"Female","salary":6714},
{"id":9,"first_name":"Cthrine","last_name":"Ell","email":"cell8@irs.gov","gender":"Female","salary":8914},
{"id":10,"first_name":"Laverna","last_name":"Mann","email":"lmann9@google.com.au","gender":"Female","salary":1858},
{"id":11,"first_name":"Roxi","last_name":"Baynham","email":"rbaynhama@msu.edu","gender":"Female","salary":9290},
{"id":12,"first_name":"Katherina","last_name":"Hugle","email":"khugleb@telegraph.co.uk","gender":"Female","salary":2935},
{"id":13,"first_name":"Emyle","last_name":"Conlon","email":"econlonc@answers.com","gender":"Female","salary":4396},
{"id":14,"first_name":"Ulick","last_name":"Kilty","email":"ukiltyd@furl.net","gender":"Male","salary":3736},
{"id":15,"first_name":"Tanitansy","last_name":"Eilers","email":"teilerse@uol.com.br","gender":"Non-binary","salary":9409},
{"id":16,"first_name":"Trudy","last_name":"Rowaszkiewicz","email":"trowaszkiewiczf@nsw.gov.au","gender":"Female","salary":6268},
{"id":17,"first_name":"Lesley","last_name":"Oleksinski","email":"loleksinskig@altervista.org","gender":"Male","salary":7190},
{"id":18,"first_name":"Susannah","last_name":"Ritson","email":"sritsonh@youku.com","gender":"Female","salary":3271},
{"id":19,"first_name":"Sibylla","last_name":"Clinnick","email":"sclinnicki@whitehouse.gov","gender":"Female","salary":7640},
{"id":20,"first_name":"Randi","last_name":"Clohissy","email":"rclohissyj@amazon.co.jp","gender":"Female","salary":6200}]`;


let employees = JSON.parse(json);
console.log(employees);



document.querySelector('#searchGender').addEventListener('change', function(e) {
	initList();

})
function initList() {
	let target = document.getElementById('empList');
	target.innerHTML = '';
	let selValue = document.querySelector('#searchGender').value;
	employees.forEach(emp => {
		if (selValue == 'All' || emp.gender == selValue) {
			target.appendChild(makeRow(emp));

		}
	});
}
initList();

// 사원정보 => row 생성
function makeRow(emp = {}) {
	let fields = ['id', 'first_name', 'last_name', 'salary'];
	let tr = document.createElement('tr');
	fields.forEach(field => {
		let td = document.createElement('td');
		td.innerHTML = emp[field];
		tr.appendChild(td)
	})
	return tr;
}

