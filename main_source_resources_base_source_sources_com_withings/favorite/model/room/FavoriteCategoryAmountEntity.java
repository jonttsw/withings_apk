package com.withings.favorite.model.room;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: FavoriteCategoryAmountEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/withings/favorite/model/room/FavoriteCategoryAmountEntity;", "", "type", "", "count", "", "(Ljava/lang/String;I)V", "getCount", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FavoriteCategoryAmountEntity {
    private final int count;
    private final String type;

    public FavoriteCategoryAmountEntity(String type, int i11) {
        u.j(type, "type");
        this.type = type;
        this.count = i11;
    }

    public static /* synthetic */ FavoriteCategoryAmountEntity copy$default(FavoriteCategoryAmountEntity favoriteCategoryAmountEntity, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = favoriteCategoryAmountEntity.type;
        }
        if ((i12 & 2) != 0) {
            i11 = favoriteCategoryAmountEntity.count;
        }
        return favoriteCategoryAmountEntity.copy(str, i11);
    }

    public final String component1() {
        return this.type;
    }

    public final int component2() {
        return this.count;
    }

    public final FavoriteCategoryAmountEntity copy(String type, int i11) {
        u.j(type, "type");
        return new FavoriteCategoryAmountEntity(type, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteCategoryAmountEntity)) {
            return false;
        }
        FavoriteCategoryAmountEntity favoriteCategoryAmountEntity = (FavoriteCategoryAmountEntity) obj;
        if (u.e(this.type, favoriteCategoryAmountEntity.type) && this.count == favoriteCategoryAmountEntity.count) {
            return true;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + (this.type.hashCode() * 31);
    }

    public String toString() {
        String str = this.type;
        int i11 = this.count;
        return "FavoriteCategoryAmountEntity(type=" + str + ", count=" + i11 + ")";
    }
}
