package com.withings.library.authentication.di;

import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.api.constant.ApiConstantProviderImpl;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.api.error.PlatformNetworkExceptionChecker;
import com.withings.library.authentication.host.AuthenticationDependenciesBuilder;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.host.session.PreviousSessionRepository;
import com.withings.library.authentication.utils.locale.LocaleProvider;
import com.withings.library.authentication.utils.locale.PlatformLocaleProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.koin.core.definition.Kind;
import rq0.c;
import sq0.d;
import uq0.a;
import wq0.b;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KoinAndroid.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luq0/a;", "Lnm0/y;", "invoke", "(Luq0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class KoinAndroidKt$initAuthentication$1 extends w implements l<a, y> {
    final /* synthetic */ AuthenticationDependenciesBuilder $dependenciesBuilder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KoinAndroid.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinAndroidKt$initAuthentication$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends w implements p<yq0.a, vq0.a, DeviceInformationProvider> {
        final /* synthetic */ AuthenticationDependenciesBuilder $dependenciesBuilder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AuthenticationDependenciesBuilder authenticationDependenciesBuilder) {
            super(2);
            this.$dependenciesBuilder = authenticationDependenciesBuilder;
        }

        @Override // ym0.p
        public final DeviceInformationProvider invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return this.$dependenciesBuilder.getDeviceInformationProvider();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KoinAndroid.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinAndroidKt$initAuthentication$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends w implements p<yq0.a, vq0.a, ApplicationInformationProvider> {
        final /* synthetic */ AuthenticationDependenciesBuilder $dependenciesBuilder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AuthenticationDependenciesBuilder authenticationDependenciesBuilder) {
            super(2);
            this.$dependenciesBuilder = authenticationDependenciesBuilder;
        }

        @Override // ym0.p
        public final ApplicationInformationProvider invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return this.$dependenciesBuilder.getApplicationInformationProvider();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KoinAndroid.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/host/session/PreviousSessionRepository;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/host/session/PreviousSessionRepository;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinAndroidKt$initAuthentication$1$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends w implements p<yq0.a, vq0.a, PreviousSessionRepository> {
        final /* synthetic */ AuthenticationDependenciesBuilder $dependenciesBuilder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AuthenticationDependenciesBuilder authenticationDependenciesBuilder) {
            super(2);
            this.$dependenciesBuilder = authenticationDependenciesBuilder;
        }

        @Override // ym0.p
        public final PreviousSessionRepository invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return this.$dependenciesBuilder.getPreviousSessionRepository();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KoinAndroid.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinAndroidKt$initAuthentication$1$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends w implements p<yq0.a, vq0.a, ApiConstantProvider> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(2);
        }

        @Override // ym0.p
        public final ApiConstantProvider invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new ApiConstantProviderImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KoinAndroid.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinAndroidKt$initAuthentication$1$5  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass5 extends w implements p<yq0.a, vq0.a, LocaleProvider> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(2);
        }

        @Override // ym0.p
        public final LocaleProvider invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new PlatformLocaleProvider();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KoinAndroid.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinAndroidKt$initAuthentication$1$6  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass6 extends w implements p<yq0.a, vq0.a, NetworkExceptionChecker> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(2);
        }

        @Override // ym0.p
        public final NetworkExceptionChecker invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new PlatformNetworkExceptionChecker();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinAndroidKt$initAuthentication$1(AuthenticationDependenciesBuilder authenticationDependenciesBuilder) {
        super(1);
        this.$dependenciesBuilder = authenticationDependenciesBuilder;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(a module) {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        b bVar6;
        u.j(module, "$this$module");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dependenciesBuilder);
        bVar = xq0.b.f107445e;
        Kind kind = Kind.f89818a;
        d<?> b10 = com.google.android.filament.utils.a.b(new rq0.a(bVar, q0.b(DeviceInformationProvider.class), anonymousClass1, kind), module);
        if (module.e()) {
            module.g(b10);
        }
        new c(module, b10);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$dependenciesBuilder);
        bVar2 = xq0.b.f107445e;
        d<?> b11 = com.google.android.filament.utils.a.b(new rq0.a(bVar2, q0.b(ApplicationInformationProvider.class), anonymousClass2, kind), module);
        if (module.e()) {
            module.g(b11);
        }
        new c(module, b11);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$dependenciesBuilder);
        bVar3 = xq0.b.f107445e;
        d<?> b12 = com.google.android.filament.utils.a.b(new rq0.a(bVar3, q0.b(PreviousSessionRepository.class), anonymousClass3, kind), module);
        if (module.e()) {
            module.g(b12);
        }
        new c(module, b12);
        AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
        bVar4 = xq0.b.f107445e;
        d<?> b13 = com.google.android.filament.utils.a.b(new rq0.a(bVar4, q0.b(ApiConstantProvider.class), anonymousClass4, kind), module);
        if (module.e()) {
            module.g(b13);
        }
        new c(module, b13);
        AnonymousClass5 anonymousClass5 = AnonymousClass5.INSTANCE;
        bVar5 = xq0.b.f107445e;
        d<?> b14 = com.google.android.filament.utils.a.b(new rq0.a(bVar5, q0.b(LocaleProvider.class), anonymousClass5, kind), module);
        if (module.e()) {
            module.g(b14);
        }
        new c(module, b14);
        AnonymousClass6 anonymousClass6 = AnonymousClass6.INSTANCE;
        bVar6 = xq0.b.f107445e;
        d<?> b15 = com.google.android.filament.utils.a.b(new rq0.a(bVar6, q0.b(NetworkExceptionChecker.class), anonymousClass6, kind), module);
        if (module.e()) {
            module.g(b15);
        }
        new c(module, b15);
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(a aVar) {
        invoke2(aVar);
        return y.f85009a;
    }
}
