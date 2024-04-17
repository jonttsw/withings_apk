package com.withings.insight.core.model;

import androidx.camera.camera2.internal.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SelectedExchange.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/withings/insight/core/model/SelectedExchange;", "", "messageId", "", "suggestionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getSuggestionId", "setSuggestionId", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectedExchange {
    private final String messageId;
    private String suggestionId;

    public SelectedExchange(String messageId, String str) {
        u.j(messageId, "messageId");
        this.messageId = messageId;
        this.suggestionId = str;
    }

    public static /* synthetic */ SelectedExchange copy$default(SelectedExchange selectedExchange, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = selectedExchange.messageId;
        }
        if ((i11 & 2) != 0) {
            str2 = selectedExchange.suggestionId;
        }
        return selectedExchange.copy(str, str2);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.suggestionId;
    }

    public final SelectedExchange copy(String messageId, String str) {
        u.j(messageId, "messageId");
        return new SelectedExchange(messageId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedExchange)) {
            return false;
        }
        SelectedExchange selectedExchange = (SelectedExchange) obj;
        if (u.e(this.messageId, selectedExchange.messageId) && u.e(this.suggestionId, selectedExchange.suggestionId)) {
            return true;
        }
        return false;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getSuggestionId() {
        return this.suggestionId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.messageId.hashCode() * 31;
        String str = this.suggestionId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final void setSuggestionId(String str) {
        this.suggestionId = str;
    }

    public String toString() {
        return k0.c("SelectedExchange(messageId=", this.messageId, ", suggestionId=", this.suggestionId, ")");
    }
}
