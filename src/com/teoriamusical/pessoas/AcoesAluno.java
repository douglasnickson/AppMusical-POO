package com.teoriamusical.pessoas;

import com.teoriamusical.app.Assunto;
import com.teoriamusical.app.Modulo;

public interface AcoesAluno {
	public void acessarModulo(Modulo modulo);
	public void fazExercicio();
	public void acessarAssunto(Assunto assunto);
	public void assinarPremium();
}
