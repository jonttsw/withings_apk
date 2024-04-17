package com.withings.programs.model.program;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: EligibilityDomain.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/withings/programs/model/program/EligibilityDomain;", "", "status", "", "url", "", "(ZLjava/lang/String;)V", "getStatus", "()Z", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EligibilityDomain {
    private final boolean status;
    private final String url;

    public EligibilityDomain(boolean z5, String str) {
        this.status = z5;
        this.url = str;
    }

    public static /* synthetic */ EligibilityDomain copy$default(EligibilityDomain eligibilityDomain, boolean z5, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z5 = eligibilityDomain.status;
        }
        if ((i11 & 2) != 0) {
            str = eligibilityDomain.url;
        }
        return eligibilityDomain.copy(z5, str);
    }

    public final boolean component1() {
        return this.status;
    }

    public final String component2() {
        return this.url;
    }

    public final EligibilityDomain copy(boolean z5, String str) {
        return new EligibilityDomain(z5, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EligibilityDomain)) {
            return false;
        }
        EligibilityDomain eligibilityDomain = (EligibilityDomain) obj;
        if (this.status == eligibilityDomain.status && u.e(this.url, eligibilityDomain.url)) {
            return true;
        }
        return false;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.status) * 31;
        String str = this.url;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        boolean z5 = this.status;
        String str = this.url;
        return "EligibilityDomain(status=" + z5 + ", url=" + str + ")";
    }

    public /* synthetic */ EligibilityDomain(boolean z5, String str, int i11, m mVar) {
        this(z5, (i11 & 2) != 0 ? null : str);
    }
}
