export class RgbGeneratorRequestModel {

  private red: number;
  private green: number;
  private blue: number;
  private text: string;

  constructor(red: number, green: number, blue: number, text: string) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.text = text;
  }
}

