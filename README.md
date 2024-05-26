# Control Flow Graph
![ControlFlowGraph](https://github.com/nikola-bozinovski/SI_2024_lab2_226054/assets/166914433/cb286ec5-6447-40a9-9535-8c184c438742)
# Цикломатската Комплексност
цикломатската комплексност се пресметува со E - N + 2P, каде:<br>
  E, број на ребра ни е 32<br>
  N, број на темиња ни е 24<br>
  P, број на компоненти ни е 1<br>
  Тоест, 32 - 24 + 2*1, цикломатската комплексност е 10.<br>
  
# Every Branch Критериум 

# Multiple Condition Критериум 
Условот: if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')<br>
е задоволен ако:<br>
	item price > 300<br>
	item discount > 0<br>
	првиот карактер од item bacode е '0'<br>
во сите други случаи, условот не е задоволен.<br>
