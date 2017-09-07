package com.teoriamusical.pessoas;

import com.teoriamusical.app.Assunto;
import com.teoriamusical.app.Exercicio;
import com.teoriamusical.app.Modulo;

public interface AcoesAluno {
	public void acessarModulo(Modulo modulo);
	public void fazExercicio(Exercicio exercicio);
	public void acessarAssunto(Assunto assunto);
	public void assinarPremium();
}
