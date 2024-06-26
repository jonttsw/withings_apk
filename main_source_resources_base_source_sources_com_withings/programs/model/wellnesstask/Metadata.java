package com.withings.programs.model.wellnesstask;

import kotlin.jvm.internal.u;
/* compiled from: Metadata.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/withings/programs/model/wellnesstask/Metadata;", "", "measureType", "", "(Ljava/lang/Integer;)V", "getMeasureType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/withings/programs/model/wellnesstask/Metadata;", "equals", "", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Metadata {
    private final Integer measureType;

    public Metadata(Integer num) {
        this.measureType = num;
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = metadata.measureType;
        }
        return metadata.copy(num);
    }

    public final Integer component1() {
        return this.measureType;
    }

    public final Metadata copy(Integer num) {
        return new Metadata(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Metadata) && u.e(this.measureType, ((Metadata) obj).measureType)) {
            return true;
        }
        return false;
    }

    public final Integer getMeasureType() {
        return this.measureType;
    }

    public int hashCode() {
        Integer num = this.measureType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.measureType;
        return "Metadata(measureType=" + num + ")";
    }
}
