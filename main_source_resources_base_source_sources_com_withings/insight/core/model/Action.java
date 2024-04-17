package com.withings.insight.core.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
/* compiled from: Action.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/withings/insight/core/model/Action;", "", AMPExtension.Action.ATTRIBUTE_NAME, "", "conditions", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getConditions", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Action {
    private String action;
    private final Map<String, String> conditions;

    public Action(String action, Map<String, String> map) {
        u.j(action, "action");
        this.action = action;
        this.conditions = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Action copy$default(Action action, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = action.action;
        }
        if ((i11 & 2) != 0) {
            map = action.conditions;
        }
        return action.copy(str, map);
    }

    public final String component1() {
        return this.action;
    }

    public final Map<String, String> component2() {
        return this.conditions;
    }

    public final Action copy(String action, Map<String, String> map) {
        u.j(action, "action");
        return new Action(action, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        if (u.e(this.action, action.action) && u.e(this.conditions, action.conditions)) {
            return true;
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final Map<String, String> getConditions() {
        return this.conditions;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.action.hashCode() * 31;
        Map<String, String> map = this.conditions;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final void setAction(String str) {
        u.j(str, "<set-?>");
        this.action = str;
    }

    public String toString() {
        String str = this.action;
        Map<String, String> map = this.conditions;
        return "Action(action=" + str + ", conditions=" + map + ")";
    }

    public /* synthetic */ Action(String str, Map map, int i11, m mVar) {
        this(str, (i11 & 2) != 0 ? null : map);
    }
}
