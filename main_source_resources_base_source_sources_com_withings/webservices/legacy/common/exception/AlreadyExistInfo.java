package com.withings.webservices.legacy.common.exception;

import android.support.v4.media.session.c;
import androidx.camera.core.v;
import kotlin.Metadata;
/* compiled from: AlreadyExistsException.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/webservices/legacy/common/exception/AlreadyExistInfo;", "", "id", "", "modified", "(JJ)V", "getId", "()J", "getModified", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AlreadyExistInfo {

    /* renamed from: id  reason: collision with root package name */
    private final long f46848id;
    private final long modified;

    public AlreadyExistInfo(long j5, long j11) {
        this.f46848id = j5;
        this.modified = j11;
    }

    public static /* synthetic */ AlreadyExistInfo copy$default(AlreadyExistInfo alreadyExistInfo, long j5, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = alreadyExistInfo.f46848id;
        }
        if ((i11 & 2) != 0) {
            j11 = alreadyExistInfo.modified;
        }
        return alreadyExistInfo.copy(j5, j11);
    }

    public final long component1() {
        return this.f46848id;
    }

    public final long component2() {
        return this.modified;
    }

    public final AlreadyExistInfo copy(long j5, long j11) {
        return new AlreadyExistInfo(j5, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlreadyExistInfo)) {
            return false;
        }
        AlreadyExistInfo alreadyExistInfo = (AlreadyExistInfo) obj;
        if (this.f46848id == alreadyExistInfo.f46848id && this.modified == alreadyExistInfo.modified) {
            return true;
        }
        return false;
    }

    public final long getId() {
        return this.f46848id;
    }

    public final long getModified() {
        return this.modified;
    }

    public int hashCode() {
        return Long.hashCode(this.modified) + (Long.hashCode(this.f46848id) * 31);
    }

    public String toString() {
        long j5 = this.f46848id;
        return c.c(v.e("AlreadyExistInfo(id=", j5, ", modified="), this.modified, ")");
    }
}
