package events;

import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;
import java.util.TooManyListenersException;

public class Listener1 {

	public void addKeyListener(KeyListener NazvaPrujma4aEventa){
	//	ВИГЛАД МЕТОДА ДЖЕРЕЛА ПОДІЇ ЯКЕ РЕАГУЄ НА КЛАВІАТУРУ
//		Когда наступает событие, все зарегистрированные приемники получают копию объекта
//		события. Этот процесс называется групповой рассъикой событий.
//		Но в любом случае
//		уведомления отправляются только тем приемникам, которые зарегистрированы
//		на их получение.
	}
	
	public void addMouseMotionListener(MouseMotionListener NazvaPrujma4aEventa){
		//	ВИГЛАД МЕТОДА ДЖЕРЕЛА ПОДІЇ ЯКЕ РЕАГУЄ НА Рух Мишки
//		де (MouseMotion)Тип обозначает имя объекта события , а NazvaPrujma4aEventa(приемник_ событий)- ссылку на конкретный
//		приемник событий
	}
	
//		Некоторые источники допускают регистрацию только одного приемника.
//		Ниже приведена общая форма такого метода.
	public void addTypeListener (/*TypeListener NazvaPrujma4aEventa*/)throws TooManyListenersException
			{
//		Когда такое событие наступает, зарегистрированный
//		приемник получает уведомление об этом событие. Этот процесс называется
//		целевой рассылкой событий.
			}
	
//	Источник должен также предоставлять метод, позволяющий снять приемник
//	с регистрации определенного типа событий. Общая форма этого метода следующая:
//	puЬlic void remove Type_Listener (Type_Listener прийомникПодії)
	
//	Методы, которые добавляют или удаляют регистрируемые источники событий
//	, предоставляются источником, генерирующим событие.





}