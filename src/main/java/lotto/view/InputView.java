package lotto.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class InputView {
  public static int getLottoPrice (BufferedReader reader) throws IOException {
    System.out.print("구입금액을 입력해 주세요.\n");
    String lottoPrice = reader.readLine();
    return Integer.parseInt(lottoPrice);
  }

  public static Set<Integer> getLastWeekLottoNumbers(BufferedReader reader) throws IOException {
    System.out.print("\n지난 주 당첨 번호를 입력해 주세요.\n");
    String lottoPrice = reader.readLine();
    return Arrays.stream(lottoPrice.split(","))
        .map(String::strip)
        .map(Integer::parseInt)
        .collect(Collectors.toSet());
  }
}