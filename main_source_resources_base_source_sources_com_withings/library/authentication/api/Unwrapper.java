package com.withings.library.authentication.api;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import jl0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import pq0.a;
import vk0.m;
import ym0.l;
/* compiled from: Unwrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/library/authentication/api/Unwrapper;", "Lpq0/a;", "<init>", "()V", "Feature", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Unwrapper implements a {
    public static final Feature Feature = new Feature(null);
    private static final gl0.a<Unwrapper> key = new gl0.a<>("ClientUnwrap");

    /* compiled from: Unwrapper.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/withings/library/authentication/api/Unwrapper$Feature;", "Lvk0/m;", "Lnm0/y;", "Lcom/withings/library/authentication/api/Unwrapper;", "Lpq0/a;", "feature", "Lqk0/a;", CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, "install", "(Lcom/withings/library/authentication/api/Unwrapper;Lqk0/a;)V", "Lkotlin/Function1;", "block", "prepare", "(Lym0/l;)Lcom/withings/library/authentication/api/Unwrapper;", "Lgl0/a;", "key", "Lgl0/a;", "getKey", "()Lgl0/a;", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Feature implements m<y, Unwrapper>, a {
        public /* synthetic */ Feature(kotlin.jvm.internal.m mVar) {
            this();
        }

        @Override // vk0.m
        public gl0.a<Unwrapper> getKey() {
            return Unwrapper.key;
        }

        @Override // pq0.a
        public oq0.a getKoin() {
            return qq0.a.f93676a.a();
        }

        @Override // vk0.m
        public void install(Unwrapper feature, qk0.a scope) {
            f fVar;
            u.j(feature, "feature");
            u.j(scope, "scope");
            bl0.f i11 = scope.i();
            fVar = bl0.f.f21513i;
            i11.h(fVar, new Unwrapper$Feature$install$1(null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // vk0.m
        public Unwrapper prepare(l<? super y, y> block) {
            u.j(block, "block");
            return new Unwrapper();
        }

        private Feature() {
        }
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }
}
