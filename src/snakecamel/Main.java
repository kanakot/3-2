package snakecamel;

public class Main {

	
	public static void main(String[] args) {
		SnakeCamelUtil a = new SnakeCamelUtil();
		System.out.println(a.capitalize(""));
		System.out.println(a.capitalize("a"));
		System.out.println(a.capitalize("xyz"));
		System.out.println(a.uncapitalize(""));
		System.out.println(a.uncapitalize("A"));
		System.out.println(a.uncapitalize("Xyz"));
		System.out.println(a.snakeToCamelcase("abc"));
		System.out.println(a.snakeToCamelcase("abc_def"));
		System.out.println(a.snakeToCamelcase("abc_def_gh"));
		System.out.println(a.snakeToCamelcase("abc__def__gh"));
		System.out.println(a.snakeToCamelcase("_abc_def__"));
		System.out.println(a.camelToSnakecase("abc"));
		System.out.println(a.camelToSnakecase("AbcDef"));
		System.out.println(a.camelToSnakecase("AbcDefGh"));
	
		
		
		
		

	}

}
