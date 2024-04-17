package com.withings.common.compose.component;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Avatar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/AvatarSize;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AvatarSize {

    /* renamed from: b  reason: collision with root package name */
    public static final AvatarSize f33297b;

    /* renamed from: c  reason: collision with root package name */
    public static final AvatarSize f33298c;

    /* renamed from: d  reason: collision with root package name */
    public static final AvatarSize f33299d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AvatarSize[] f33300e;

    /* renamed from: a  reason: collision with root package name */
    private final int f33301a;

    static {
        AvatarSize avatarSize = new AvatarSize("Large", 0, 120);
        f33297b = avatarSize;
        AvatarSize avatarSize2 = new AvatarSize("Medium", 1, 80);
        f33298c = avatarSize2;
        AvatarSize avatarSize3 = new AvatarSize("Smallium", 2, 60);
        AvatarSize avatarSize4 = new AvatarSize("Small", 3, 40);
        f33299d = avatarSize4;
        AvatarSize[] avatarSizeArr = {avatarSize, avatarSize2, avatarSize3, avatarSize4, new AvatarSize("ExtraSmall", 4, 20)};
        f33300e = avatarSizeArr;
        sm0.b.a(avatarSizeArr);
    }

    private AvatarSize(String str, int i11, int i12) {
        this.f33301a = i12;
    }

    public static AvatarSize valueOf(String str) {
        return (AvatarSize) Enum.valueOf(AvatarSize.class, str);
    }

    public static AvatarSize[] values() {
        return (AvatarSize[]) f33300e.clone();
    }

    public final int a() {
        return this.f33301a;
    }
}
