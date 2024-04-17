package com.withings.graph.decorator;

import android.graphics.Canvas;
import com.withings.graph.GraphView;
import ts.d;
/* loaded from: classes3.dex */
public abstract class Decorator extends ts.d {

    /* renamed from: j  reason: collision with root package name */
    private DrawOrder f39676j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class DrawOrder {

        /* renamed from: a  reason: collision with root package name */
        public static final DrawOrder f39677a;

        /* renamed from: b  reason: collision with root package name */
        public static final DrawOrder f39678b;

        /* renamed from: c  reason: collision with root package name */
        public static final DrawOrder f39679c;

        /* renamed from: d  reason: collision with root package name */
        public static final DrawOrder f39680d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ DrawOrder[] f39681e;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.graph.decorator.Decorator$DrawOrder, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.graph.decorator.Decorator$DrawOrder, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.graph.decorator.Decorator$DrawOrder, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.graph.decorator.Decorator$DrawOrder, java.lang.Enum] */
        static {
            ?? r02 = new Enum("FRONT", 0);
            f39677a = r02;
            ?? r12 = new Enum("BACK", 1);
            f39678b = r12;
            ?? r22 = new Enum("BEHIND_AXIS", 2);
            f39679c = r22;
            ?? r32 = new Enum("AHEAD_AXIS", 3);
            f39680d = r32;
            f39681e = new DrawOrder[]{r02, r12, r22, r32};
        }

        private DrawOrder() {
            throw null;
        }

        public static DrawOrder valueOf(String str) {
            return (DrawOrder) Enum.valueOf(DrawOrder.class, str);
        }

        public static DrawOrder[] values() {
            return (DrawOrder[]) f39681e.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class a<S extends Decorator, T extends a<S, T>> extends d.a {

        /* renamed from: i  reason: collision with root package name */
        protected DrawOrder f39682i = DrawOrder.f39678b;

        public final void o(DrawOrder drawOrder) {
            this.f39682i = drawOrder;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Decorator(a aVar) {
        super(aVar);
        this.f39676j = aVar.f39682i;
    }

    public final DrawOrder n() {
        return this.f39676j;
    }

    @Override // ts.d
    public void a(GraphView graphView, Canvas canvas) {
    }
}
