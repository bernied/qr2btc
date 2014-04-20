package qr2btc;

import org.junit.*;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for Qr2Btc class.
 * @author Bernhard Damberger
 */
public class TestQr2Btc
{
  @Test
  public void testDecode() throws Exception
  {
    Qr2Btc qr2btc = new Qr2Btc();

    Path p = FileSystems.getDefault().getPath("src", "test", "resources", "1.png");

    String result = qr2btc.decode(p);
    assertEquals("1ETeuCJ9EibJYvorf6zZyKagkX5U52cckV", result);
  }

  @Test
  public void testDecode_2() throws Exception
  {
    Qr2Btc qr2btc = new Qr2Btc();

    Path p = FileSystems.getDefault().getPath("src", "test", "resources", "2.png");

    String[] result = qr2btc.decodeMultiple(p);
    assertEquals(2, result.length);
    assertEquals("1ETeuCJ9EibJYvorf6zZyKagkX5U52cckV", result[0]);
    assertEquals("5J4d9sAbnoPs6PhQgn1SD887WviaFqEUsnofU3DXKpndEp9YPio", result[1]);
  }

  @Test
  public void testDecode_14_1() throws Exception
  {
    Qr2Btc qr2btc = new Qr2Btc();
    Path p = FileSystems.getDefault().getPath("src", "test", "resources", "14_1.png");

    String[] result = qr2btc.decodeMultiple(p);
    assertEquals(14, result.length);
    assertEquals("1B3Jn279gctjpwESyhLcM9miYTtQkJ7dLB",                  result[ 0]);
    assertEquals("5JhVSMVbLY1Ge42DbdBw2kurpFZgzY2Bv6bSGBHeL7HLdh9woRt", result[ 1]);
    assertEquals("16dfArQ1rqPCC7NWJPCJSRYJc5QNzKjgBz",                  result[ 2]);
    assertEquals("5KJrKRFhWgCFVGNJRSrDm1nAbo5xLywNyFspx7wsjqrZFH98QzC", result[ 3]);
    assertEquals("1LBFSv79gn8Ud2sm2XmyXzMYAkJDQhjgcE",                  result[ 4]);
    assertEquals("5Htqzh1RmJpRXjrkx2qjunMNzuWj1w1gVKLa6x1JmfY9u5Daapw", result[ 5]);
    assertEquals("15m3Un1upntdjMKEgNLT6Fkj6tDgdAP2YP",                  result[ 6]);
    assertEquals("5KEB5kwh9wyyD7Qiq5BywzKoD5PyghupubdHiBFjRiHjb8EMhyE", result[ 7]);
    assertEquals("124rMyFfre35UMNogjYjVsZvRNZj1V4Mvn",                  result[ 8]);
    assertEquals("5K9i9VKco3SyUwp7NDo4fYqxPLQRC9UFF21pFUHuY6267Pr5Mv4", result[ 9]);
    assertEquals("1Q1uW9FR9TZKGoyGzHB3bk2V7BCgAJVBq6",                  result[10]);
    assertEquals("5HpvUvoj3HdkY6CAUDcGZpXnkyRaroNySqEbJz4LGqBjujAEy9L", result[11]);
    assertEquals("15iAJKUSGqChjbCQRnbEVhsCFCWB8ju1J8",                  result[12]);
    assertEquals("5JDEK6fXs5sUF9csYLEMNGcMSZ42RJDHHj7j1SZv5LX38vt8qXZ", result[13]);
  }

  @Test
  public void testDecode_14_2() throws Exception
  {
    Qr2Btc qr2btc = new Qr2Btc();
    Path p = FileSystems.getDefault().getPath("src", "test", "resources", "14_2.png");

    String[] result = qr2btc.decodeMultiple(p);
    assertEquals(14, result.length);
    assertEquals("1BJv8o4c9Dukjs4gm4XU9tV1G92FJGVLS6",                  result[ 0]);
    assertEquals("5JNHjSLJCq6gnnoDbwrWGZQLXKnMuAM1YCHumsAf3jiujcbdNju", result[ 1]);
    assertEquals("12fwfRA1dtNZPLPnHS7CdncKrYQUN8KAGE",                  result[ 2]);
    assertEquals("5K1tU5f3Ew71FYfuuyTdrWpZcJseYkmoznkbxHifu1evwFHsbQA", result[ 3]);
    assertEquals("17Bs7vPWM1cz8tSoAMTygzmoXsWdaSXpwL",                  result[ 4]);
    assertEquals("5KAGD3RJ44Md1sYdYhyF92jCTDEZpwrDuzFtRFpP9qx6FJvg4JJ", result[ 5]);
    assertEquals("13zrrkHji6CidgVYDiikvP4GYmBzp4WfY1",                  result[ 6]);
    assertEquals("5JBu1SdVG3zBLgEVPhes5h4ukkvoV8hpx2BHZVaqa9qMuZQcviX", result[ 7]);
    assertEquals("19BMvu65gFTB8HcFjKZwq66Q5XSEMeAWV6",                  result[ 8]);
    assertEquals("5JPwrUfBg2MG8L8tYhdSr4Z9x23ZRGMUzZjHpVrkavDQGtSJjpK", result[ 9]);
    assertEquals("15sTD5H2qZkN4zULePP9wSgh4dBiPMW5vw",                  result[10]);
    assertEquals("5KA2RgfaPxBsyUEGURNAKTcUUMyN9TGMpy4RZsEibMZkSDzA8H3", result[11]);
    assertEquals("1LhJ6iyoGX4X5uiMjvYH1ygKnGvzxcndC",                   result[12]);
    assertEquals("5JN9B3ySt31XEycN6ZXmhbpZTMnW2Kn5B67CcQUeA6hQ6nHU6oz", result[13]);
  }

  @Test
  public void testDecode_14_enc() throws Exception
  {
    Qr2Btc qr2btc = new Qr2Btc();
    Path p = FileSystems.getDefault().getPath("src", "test", "resources", "14_enc.png");

    String[] result = qr2btc.decodeMultiple(p);
    assertEquals(14, result.length);
    assertEquals("1JSGkn7g5FmGLNas6q6UiuyMVpPFehzg2c",                  result[ 0]);
    assertEquals("6PfYDTkdX78d7gM6YFkDCm68bYHf7zGH88aGP67nUVGt31fZGquppCB435", result[ 1]);
    assertEquals("1Ey2cx9x7zUbkWS3ieTVrc58e9UtD1Cktp",                  result[ 2]);
    assertEquals("6PfUMM6g5qi2NM597vYszPdhHzm5AAv4FnbiwUNqdjYeG1NGmdpw8cM4ZM", result[ 3]);
    assertEquals("12QYwFUm6zzeWpU4NFmwZQdW8WrJQ9TMtY",                  result[ 4]);
    assertEquals("6PfVxUd9D6GiCTpBPj6VnFT7GRvh6XWmp4r9mgC3CxZd9DoiTRY2ntmZYy", result[ 5]);
    assertEquals("19yMc8FqDLsSZDgw4LXbftDmeEHKsmTXw7",                  result[ 6]);
    assertEquals("6PfMbaxBCq5vTkixmmyXyNLJeFstVPAeBJ7tjpigD85H6FK7ZrhVjyFfD2", result[ 7]);
    assertEquals("1EhZdny2L7YSUtabuTBQWi4x7Vn9SppoF1",                  result[ 8]);
    assertEquals("6PfUdrRji3N2dxgWtyzabeaiGNgp2n1kRMuUWMthhB9TjckNsfY2ZWNFcj", result[ 9]);
    assertEquals("1Mk5jtjbmpMV3xxUZvDPv2C21oGABgjKGD",                  result[10]);
    assertEquals("6PfMRUuLMSJxLEGg8LZtHKWko67QsQqe6XmiYPCYX3pQh3DKaD2mUtvM7m", result[11]);
    assertEquals("1CgA5yxpn5jkCZFTNdUJaNRUrxYefLEshR",                   result[12]);
    assertEquals("6PfX9z7DcYu4uh3JcjWWujpSBwELZnSFSnv7VpjonjRzCipyun89pZk2AQ", result[13]);
  }

  private void assertScannedPngOk(String[] result)
  {
    assertEquals(14, result.length);
    assertEquals("1H3MCvQRb93knJJDsrrFwY3TVN2pV3n7hd",                  result[ 0]);
    assertEquals("5JefF6HjnX5zC68fdTyoLoNG9Qk9RQRudrVb2iEby4PfASQvmCL", result[ 1]);
    assertEquals("1MUM9Lwpk9xxTozEfaACYv4avHyy81mc1k",                  result[ 2]);
    assertEquals("5KMJ35Pf7S7nJmBoYwMitMRjWcpeZhJ7RTLAonNSu4958WtmfBZ", result[ 3]);
    assertEquals("1EwcQbkXF4ge9pWVBMhHiLdgiiD65yFyJS",                  result[ 4]);
    assertEquals("5J64zbqmynzBdeZu3juXXGN78YZztok6NiK6y4BMyDFVFpJmwkn", result[ 5]);
    assertEquals("1DP1LZdbAMxhyXWRnk2dCjh7Pg3vnZNGwx",                  result[ 6]);
    assertEquals("5K6tZWguVVnAViziSJ2c8NpPZTRFvEpZe8VZGrL4oRvNSLbGa3e", result[ 7]);
    assertEquals("1FMG3bXPPRDGym2vDpnaWfd733s2xsjDzD",                  result[ 8]);
    assertEquals("5KBSPcVRGqtEUDZzJCxW2bkg48eZETYMY14G4v45h3xUWHhJpdm", result[ 9]);
    assertEquals("18SEA4FmiASjcVcNnzgJxCWBzc1593FjXd",                  result[10]);
    assertEquals("5JSu3em11ckqoMYDeShJJHLGxgkhJHv2gypr9dNeJ3diC8bk3ro", result[11]);
    assertEquals("18kkcW46J3mSoizs85BqAYKTpahvsUozjV",                  result[12]);
    assertEquals("5Huj37krd3uCsdv6jKE4q92eN5f5XYVqRDaBaSBUngCdtYzg6A2", result[13]);
  }

  @Test
  public void testDecode_scanned_img_bw() throws Exception
  {
    Qr2Btc qr2btc = new Qr2Btc();
    Path p = FileSystems.getDefault().getPath("src", "test", "resources", "scanned_img_bw.png");

    String[] result = qr2btc.decodeMultiple(p);
    assertScannedPngOk(result);
  }

  @Test
  public void testDecode_scanned_img_color() throws Exception
  {
    Qr2Btc qr2btc = new Qr2Btc();
    Path p = FileSystems.getDefault().getPath("src", "test", "resources", "scanned_img_co.png");

    String[] result = qr2btc.decodeMultiple(p);
    assertScannedPngOk(result);
  }

  @Test
  public void testDecode_scanned_text_bw() throws Exception
  {
    Qr2Btc qr2btc = new Qr2Btc();
    Path p = FileSystems.getDefault().getPath("src", "test", "resources", "scanned_text_bw.png");

    String[] result = qr2btc.decodeMultiple(p);
    assertScannedPngOk(result);
  }
}
