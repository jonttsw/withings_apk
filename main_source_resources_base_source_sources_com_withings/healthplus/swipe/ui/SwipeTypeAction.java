package com.withings.healthplus.swipe.ui;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeActionsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/swipe/ui/SwipeTypeAction;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SwipeTypeAction {

    /* renamed from: b  reason: collision with root package name */
    public static final SwipeTypeAction f40498b;

    /* renamed from: c  reason: collision with root package name */
    public static final SwipeTypeAction f40499c;

    /* renamed from: d  reason: collision with root package name */
    public static final SwipeTypeAction f40500d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ SwipeTypeAction[] f40501e;

    /* renamed from: a  reason: collision with root package name */
    private final int f40502a;

    static {
        SwipeTypeAction swipeTypeAction = new SwipeTypeAction("SWAP", 0, 1);
        f40498b = swipeTypeAction;
        SwipeTypeAction swipeTypeAction2 = new SwipeTypeAction("SET_BOOKMARK", 1, 2);
        f40499c = swipeTypeAction2;
        SwipeTypeAction swipeTypeAction3 = new SwipeTypeAction("UNSET_BOOKMARK", 2, 3);
        f40500d = swipeTypeAction3;
        SwipeTypeAction[] swipeTypeActionArr = {swipeTypeAction, swipeTypeAction2, swipeTypeAction3};
        f40501e = swipeTypeActionArr;
        b.a(swipeTypeActionArr);
    }

    private SwipeTypeAction(String str, int i11, int i12) {
        this.f40502a = i12;
    }

    public static SwipeTypeAction valueOf(String str) {
        return (SwipeTypeAction) Enum.valueOf(SwipeTypeAction.class, str);
    }

    public static SwipeTypeAction[] values() {
        return (SwipeTypeAction[]) f40501e.clone();
    }

    public final int a() {
        return this.f40502a;
    }
}
