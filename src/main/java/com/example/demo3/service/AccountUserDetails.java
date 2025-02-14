package com.example.demo3.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo3.data.entity.Users;

public class AccountUserDetails implements UserDetails { // UserDetailsを実装する
	private Users user;
	public AccountUserDetails(Users user) {
		this.user = user;
	}

	// パスワードを返却する
	@Override
	public String getPassword() {
		return user.getPassword();
	}

	// ユーザー名を返却する
	@Override
	public String getUsername() {
		return user.getUserName();
	}

	// アカウントの有効期限の状態を判定する
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	// アカウントのロック状態を判定する
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	// 資格情報の有効期限の状態を判定する
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	// 有効なユーザかを判定する
	@Override
	public boolean isEnabled() {
		return true;
	}

	// Entityを返す
	public Users getUser() {
		return user;
	}

	// 名前を返す
	public String getName() {
		return user.getName();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}