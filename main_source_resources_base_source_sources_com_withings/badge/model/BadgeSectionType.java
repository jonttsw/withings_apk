package com.withings.badge.model;

import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BadgeSection.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/withings/badge/model/BadgeSectionType;", "", "wsConstant", "", "(Ljava/lang/String;II)V", "getWsConstant", "()I", "WEIGHT", "STEPS", "DISTANCE", "ELEVATION", "badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BadgeSectionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BadgeSectionType[] $VALUES;
    private final int wsConstant;
    public static final BadgeSectionType WEIGHT = new BadgeSectionType("WEIGHT", 0, 1);
    public static final BadgeSectionType STEPS = new BadgeSectionType("STEPS", 1, 36);
    public static final BadgeSectionType DISTANCE = new BadgeSectionType("DISTANCE", 2, 40);
    public static final BadgeSectionType ELEVATION = new BadgeSectionType("ELEVATION", 3, 37);

    private static final /* synthetic */ BadgeSectionType[] $values() {
        return new BadgeSectionType[]{WEIGHT, STEPS, DISTANCE, ELEVATION};
    }

    static {
        BadgeSectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private BadgeSectionType(String str, int i11, int i12) {
        this.wsConstant = i12;
    }

    public static a<BadgeSectionType> getEntries() {
        return $ENTRIES;
    }

    public static BadgeSectionType valueOf(String str) {
        return (BadgeSectionType) Enum.valueOf(BadgeSectionType.class, str);
    }

    public static BadgeSectionType[] values() {
        return (BadgeSectionType[]) $VALUES.clone();
    }

    public final int getWsConstant() {
        return this.wsConstant;
    }
}
