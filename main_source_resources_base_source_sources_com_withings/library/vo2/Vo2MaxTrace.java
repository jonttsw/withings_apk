package com.withings.library.vo2;

import a1.x;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Vo2MaxOutput.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/withings/library/vo2/Vo2MaxTrace;", "", "timestamp", "", "source", "", "content", "(JLjava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getSource", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Vo2MaxTrace {
    private final String content;
    private final String source;
    private final long timestamp;

    public Vo2MaxTrace(long j5, String source, String content) {
        u.j(source, "source");
        u.j(content, "content");
        this.timestamp = j5;
        this.source = source;
        this.content = content;
    }

    public static /* synthetic */ Vo2MaxTrace copy$default(Vo2MaxTrace vo2MaxTrace, long j5, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = vo2MaxTrace.timestamp;
        }
        if ((i11 & 2) != 0) {
            str = vo2MaxTrace.source;
        }
        if ((i11 & 4) != 0) {
            str2 = vo2MaxTrace.content;
        }
        return vo2MaxTrace.copy(j5, str, str2);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.source;
    }

    public final String component3() {
        return this.content;
    }

    public final Vo2MaxTrace copy(long j5, String source, String content) {
        u.j(source, "source");
        u.j(content, "content");
        return new Vo2MaxTrace(j5, source, content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vo2MaxTrace)) {
            return false;
        }
        Vo2MaxTrace vo2MaxTrace = (Vo2MaxTrace) obj;
        if (this.timestamp == vo2MaxTrace.timestamp && u.e(this.source, vo2MaxTrace.source) && u.e(this.content, vo2MaxTrace.content)) {
            return true;
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.content.hashCode() + d.c(this.source, Long.hashCode(this.timestamp) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Vo2MaxTrace(timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", content=");
        return x.c(sb2, this.content, ')');
    }
}
