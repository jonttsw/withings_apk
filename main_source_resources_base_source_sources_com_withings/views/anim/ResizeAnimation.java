package com.withings.views.anim;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* loaded from: classes4.dex */
public final class ResizeAnimation extends Animation {

    /* renamed from: a  reason: collision with root package name */
    private int f46402a;

    /* renamed from: b  reason: collision with root package name */
    private int f46403b;

    /* renamed from: c  reason: collision with root package name */
    private View f46404c;

    /* renamed from: d  reason: collision with root package name */
    private Type f46405d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Type {

        /* renamed from: a  reason: collision with root package name */
        public static final Type f46406a;

        /* renamed from: b  reason: collision with root package name */
        private static final /* synthetic */ Type[] f46407b;
        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.views.anim.ResizeAnimation$Type] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.views.anim.ResizeAnimation$Type] */
        static {
            ?? r02 = new Enum("WIDTH", 0);
            ?? r12 = new Enum("HEIGHT", 1);
            f46406a = r12;
            f46407b = new Type[]{r02, r12};
        }

        private Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f46407b.clone();
        }
    }

    public ResizeAnimation(ViewGroup viewGroup, int i11) {
        Type type = Type.f46406a;
        this.f46404c = viewGroup;
        this.f46402a = i11;
        this.f46405d = type;
        this.f46403b = viewGroup.getHeight();
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f11, Transformation transformation) {
        int i11 = this.f46402a;
        int i12 = this.f46403b;
        int i13 = i12 + ((int) ((i11 - i12) * f11));
        int ordinal = this.f46405d.ordinal();
        View view = this.f46404c;
        if (ordinal != 0) {
            if (ordinal == 1) {
                view.getLayoutParams().height = i13;
            }
        } else {
            view.getLayoutParams().width = i13;
        }
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i11, int i12, int i13, int i14) {
        super.initialize(i11, i12, i13, i14);
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
