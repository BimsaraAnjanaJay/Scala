object Q2{
    def main (args: Array[String]): Unit = {
        var squareNumbers: List[Int] = calculateSquare(List(1, 2, 3, 4, 5));
        print(squareNumbers);
    }

    val calculateSquare = (numbers: List[Int]) =>{
        numbers.map(num => num * num);
    }
}