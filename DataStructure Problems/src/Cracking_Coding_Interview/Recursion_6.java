package Cracking_Coding_Interview;

public class Recursion_6 {

	enum Color {
		Black, White, Red, Yellow, Green
	}

	static boolean PaintFill(Color[][] screen, int x, int y, Color ocolor, Color ncolor) {
		if (x < 0 || x >= screen[0].length || y < 0 || y >= screen.length) {
			return false;
		}
		if (screen[y][x] == ocolor) {
			screen[y][x] = ncolor;
			PaintFill(screen, x - 1, y, ocolor, ncolor); // left
			PaintFill(screen, x + 1, y, ocolor, ncolor); // right
			PaintFill(screen, x, y - 1, ocolor, ncolor); // top
			PaintFill(screen, x, y + 1, ocolor, ncolor); // bottom
		}
		return true;
	}

	static boolean PaintFill(Color[][] screen, int x, int y, Color ncolor) {
		return PaintFill(screen, x, y, screen[y][x], ncolor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PaintFill(screen, x, y, ncolor)
	}

}
