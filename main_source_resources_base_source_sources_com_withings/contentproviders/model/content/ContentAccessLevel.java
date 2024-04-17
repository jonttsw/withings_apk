package com.withings.contentproviders.model.content;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentAccessLevel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "", "a", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ContentAccessLevel {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35290b;

    /* renamed from: c  reason: collision with root package name */
    public static final ContentAccessLevel f35291c;

    /* renamed from: d  reason: collision with root package name */
    public static final ContentAccessLevel f35292d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ ContentAccessLevel[] f35293e;

    /* renamed from: a  reason: collision with root package name */
    private final int f35294a;

    /* compiled from: ContentAccessLevel.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ContentAccessLevel a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return ContentAccessLevel.f35291c;
                }
                return ContentAccessLevel.f35292d;
            }
            return ContentAccessLevel.f35291c;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.withings.contentproviders.model.content.ContentAccessLevel$a] */
    static {
        ContentAccessLevel contentAccessLevel = new ContentAccessLevel("Locked", 0, 0);
        f35291c = contentAccessLevel;
        ContentAccessLevel contentAccessLevel2 = new ContentAccessLevel("Visible", 1, 1);
        f35292d = contentAccessLevel2;
        ContentAccessLevel[] contentAccessLevelArr = {contentAccessLevel, contentAccessLevel2};
        f35293e = contentAccessLevelArr;
        b.a(contentAccessLevelArr);
        f35290b = new Object();
    }

    private ContentAccessLevel(String str, int i11, int i12) {
        this.f35294a = i12;
    }

    public static ContentAccessLevel valueOf(String str) {
        return (ContentAccessLevel) Enum.valueOf(ContentAccessLevel.class, str);
    }

    public static ContentAccessLevel[] values() {
        return (ContentAccessLevel[]) f35293e.clone();
    }

    public final int a() {
        return this.f35294a;
    }
}
