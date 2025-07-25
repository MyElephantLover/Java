public class FizzBuzz {
    public List<String> fizzBuzz(int n){
        List<String> answer = new ArrayList<>(int);

        for (int i = 1; i <=n; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                answer.add("FizzBuzz");
            } else if (divisibleBy3) {
                answer.add("Fizz");
            } else if (divisibleBy5) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
            return answer;
        }

    }

}
