package kr.co.shineware.nlp.komoran.parser.model;

/**
 * Created by shin285 on 2017. 4. 13..
 */
public class UnitToken {

	@Override
	public String toString() {
		return "UnitToken{" +
				"tokenIndex=" + tokenIndex +
				", token=" + token +
				", tokenType=" + tokenType +
				'}';
	}

	private int tokenIndex;
	private char token;
	private TYPE tokenType;

	public UnitToken(char token, int tokenIndex, TYPE tokenType) {
		this.token = token;
		this.tokenIndex = tokenIndex;
		this.tokenType = tokenType;
	}

	public char getToken() {
		return token;
	}

	public void setToken(char token) {
		this.token = token;
	}

	public char getChar(){
		return this.token;
	}

	public TYPE getTokenType() {
		return tokenType;
	}

	public void setTokenType(TYPE tokenType) {
		this.tokenType = tokenType;
	}

	public int getTokenIndex() {
		return tokenIndex;
	}

	public void setTokenIndex(int tokenIndex) {
		this.tokenIndex = tokenIndex;
	}
}
