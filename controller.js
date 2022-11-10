function createTable() {
    let table = ``;
    for (i =0; i< 10; i++) {
        table += `<tr>`
        for (j = 0; j < 20; j++) {
            let idBtn = i*10+j;
            table += `<td>
            <button id=idBtn style="width: 50px; height: 50px" ></button></td>`
        }
        table += `</tr> <br>`
    }
    document.getElementById("cuong").innerHTML = table
}
function writeXO() {

}