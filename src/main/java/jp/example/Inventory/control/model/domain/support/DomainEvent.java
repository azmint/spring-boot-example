package jp.example.Inventory.control.model.domain.support;

import java.time.LocalDateTime;

/**
 * ドメインイベント
 */
public interface DomainEvent
{
	/**
	 * 発生日時を返す。
	 * @return 発生日時
	 */
	LocalDateTime getDateTimeOfOccurrence();

	/**
	 * 作成日時を返す。
	 * @return 作成日時
	 */
	LocalDateTime getCreatedDateTime();

	@Override
	String toString();
}
