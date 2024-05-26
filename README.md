# Control Flow Graph
![ControlFlowGraph](https://github.com/nikola-bozinovski/SI_2024_lab2_226054/assets/166914433/cb286ec5-6447-40a9-9535-8c184c438742)
# Цикломатската Комплексност
цикломатската комплексност се пресметува со E - N + 2P, каде:<br>
  E, број на ребра ни е 32<br>
  N, број на темиња ни е 24<br>
  P, број на компоненти ни е 1<br>
  Тоест, 32 - 24 + 2*1, цикломатската комплексност е 10.<br>
  
# Every Branch Критериум 
        <tr>
            <th></th>
            <th>Case 1:</th>
            <th>Case 2:</th>
            <th>Case 3:</th>
            <th>Case 4:</th>
            <th>Case 5:</th>
        </tr>
        <tr>
            <th>1</th> <!-- &#x2713;-->
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>2</th>
            <td></td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
            <td></td>
        </tr>
        <tr>
            <th>3</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>4.1</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>4.2</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>5</th>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>6</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>7</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>8.1</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>8.2</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>8.3</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>9</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>10</th>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>11</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>12</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>13</th>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>14</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
        </tr>
        <tr>
            <th>15</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <th>16</th>
            <td></td>
            <td></td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <th>17</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <th>18</th>
            <td></td>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <th>19</th>
            <td>&#x2713;</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <th>END</th>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
            <td>&#x2713;</td>
        </tr>
<br>
Input се:<br>
    Case 1:<br>
    All Items = [Item("ABC", "0123", 400, 0.5)]<br>
    Payment = 0<br>
<br>
    Case 2:<br>
    All Items = [Item("ABC", "0123", 400, 0.5)]<br>
    payment = 1000<br>
<br>
    Case 3:<br>
    All Items = [Item("ABC", null, 0, 0)]<br>
    payment = 4<br>
<br>
    Case 4:<br>
    AllItems = null<br>
    payment = 4<br>
<br>
    Case 5:<br>
    All Items = [ Item("","0123",0,0), Item("ABCD","0123",0,1), Item("ABCD","Z",0,1)]<br>
    payment = 400<br>
<br>
# Multiple Condition Критериум 
Условот: if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')<br>
е задоволен ако:<br>
	item price > 300<br>
	item discount > 0<br>
	првиот карактер од item bacode е '0'<br>
во сите други случаи, условот не е задоволен.<br>
