package com.withings.library.authentication.di;

import ah.o;
import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.account.RemoteAccountApi;
import com.withings.library.authentication.api.auth.AuthApi;
import com.withings.library.authentication.api.auth.RemoteAuthApi;
import com.withings.library.authentication.api.httpclient.HttpClientRepository;
import com.withings.library.authentication.api.session.RemoteSessionApi;
import com.withings.library.authentication.api.session.SessionApi;
import com.withings.library.authentication.attachment.AttachmentService;
import com.withings.library.authentication.attachment.AttachmentServiceImpl;
import com.withings.library.authentication.attachment.MutableAttachmentService;
import com.withings.library.authentication.attachment.state.factory.AttachmentBirthdayVerificationFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentBirthdayVerificationFactoryImpl;
import com.withings.library.authentication.attachment.state.factory.AttachmentContactCustomerServiceFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentContactCustomerServiceFactoryImpl;
import com.withings.library.authentication.attachment.state.factory.AttachmentFinishedFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentFinishedFactoryImpl;
import com.withings.library.authentication.attachment.state.factory.AttachmentNeedMailResultFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentNeedMailResultFactoryImpl;
import com.withings.library.authentication.attachment.state.factory.AttachmentNeedSmsResultFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentNeedSmsResultFactoryImpl;
import com.withings.library.authentication.login.AuthenticationService;
import com.withings.library.authentication.login.AuthenticationServiceImpl;
import com.withings.library.authentication.login.Environment;
import com.withings.library.authentication.login.MutableAuthenticationService;
import com.withings.library.authentication.login.session.multi.MultiSessionRetriever;
import com.withings.library.authentication.login.session.multi.RemoteMultiSessionRetriever;
import com.withings.library.authentication.login.session.verify.RemoteSessionVerifier;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl;
import com.withings.library.authentication.login.state.factory.LoggedOutFactory;
import com.withings.library.authentication.login.state.factory.LoggedOutFactoryImpl;
import com.withings.library.authentication.login.state.factory.NeedAccountCreationFactory;
import com.withings.library.authentication.login.state.factory.NeedAccountCreationFactoryImpl;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactoryImpl;
import com.withings.library.authentication.login.state.factory.NeedMailResultFactory;
import com.withings.library.authentication.login.state.factory.NeedMailResultFactoryImpl;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactoryImpl;
import com.withings.library.authentication.login.state.update.LoggedInUpdaterService;
import com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl;
import com.withings.library.authentication.recovery.RecoveryCodeService;
import com.withings.library.authentication.recovery.RecoveryCodeServiceImpl;
import com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceService;
import com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceServiceImpl;
import com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi;
import com.withings.library.authentication.removevirtualdevice.api.virtualdevice.VirtualDeviceApi;
import com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService;
import com.withings.library.authentication.sensitiveaction.SensitiveActionService;
import com.withings.library.authentication.sensitiveaction.SensitiveActionServiceImpl;
import com.withings.library.authentication.sensitiveaction.factory.InitializationErrorSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.InitializationErrorSensitiveActionStateFactoryImpl;
import com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactoryImpl;
import com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactoryImpl;
import com.withings.library.authentication.sensitiveaction.factory.NeedMailResultSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedMailResultSensitiveActionStateFactoryImpl;
import com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactoryImpl;
import com.withings.library.authentication.sensitiveaction.factory.NeedPhoneNumberSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedPhoneNumberSensitiveActionStateFactoryImpl;
import com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactoryImpl;
import com.withings.library.authentication.setup2fa.MutableSetup2FAService;
import com.withings.library.authentication.setup2fa.Setup2FAService;
import com.withings.library.authentication.setup2fa.Setup2FAServiceImpl;
import com.withings.library.authentication.setup2fa.state.factory.InitializationError2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.InitializationError2FASetupFactoryImpl;
import com.withings.library.authentication.setup2fa.state.factory.NeedCode2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.NeedCode2FASetupFactoryImpl;
import com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactoryImpl;
import com.withings.library.authentication.setup2fa.state.factory.Registered2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.Registered2FASetupFactoryImpl;
import com.withings.library.authentication.setup2fa.state.factory.Unregistered2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.Unregistered2FASetupFactoryImpl;
import com.withings.library.authentication.updateaccount.UpdateAccountService;
import com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.koin.core.definition.Kind;
import rq0.c;
import sq0.d;
import uq0.a;
import v9.e;
import v9.h;
import wq0.b;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Koin.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luq0/a;", "Lnm0/y;", "invoke", "(Luq0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class KoinKt$commonModule$1 extends w implements l<a, y> {
    final /* synthetic */ ym0.a<Environment> $environment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends w implements p<yq0.a, vq0.a, HttpClientRepository> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // ym0.p
        public final HttpClientRepository invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new HttpClientRepository();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$10  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass10 extends w implements p<yq0.a, vq0.a, LoggedInFactory> {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        AnonymousClass10() {
            super(2);
        }

        @Override // ym0.p
        public final LoggedInFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new LoggedInFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$11  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass11 extends w implements p<yq0.a, vq0.a, NeedPhoneNumber2FACreationFactory> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        AnonymousClass11() {
            super(2);
        }

        @Override // ym0.p
        public final NeedPhoneNumber2FACreationFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedPhoneNumber2FACreationFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$12  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass12 extends w implements p<yq0.a, vq0.a, NeedCode2FAFactory> {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        AnonymousClass12() {
            super(2);
        }

        @Override // ym0.p
        public final NeedCode2FAFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedCode2FAFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$13  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass13 extends w implements p<yq0.a, vq0.a, NeedAccountCreationFactory> {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        AnonymousClass13() {
            super(2);
        }

        @Override // ym0.p
        public final NeedAccountCreationFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedAccountCreationFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/state/factory/NeedMailResultFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/state/factory/NeedMailResultFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$14  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass14 extends w implements p<yq0.a, vq0.a, NeedMailResultFactory> {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        AnonymousClass14() {
            super(2);
        }

        @Override // ym0.p
        public final NeedMailResultFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedMailResultFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentBirthdayVerificationFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/attachment/state/factory/AttachmentBirthdayVerificationFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$15  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass15 extends w implements p<yq0.a, vq0.a, AttachmentBirthdayVerificationFactory> {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        AnonymousClass15() {
            super(2);
        }

        @Override // ym0.p
        public final AttachmentBirthdayVerificationFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new AttachmentBirthdayVerificationFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedMailResultFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedMailResultFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$16  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass16 extends w implements p<yq0.a, vq0.a, AttachmentNeedMailResultFactory> {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        AnonymousClass16() {
            super(2);
        }

        @Override // ym0.p
        public final AttachmentNeedMailResultFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new AttachmentNeedMailResultFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedSmsResultFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedSmsResultFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$17  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass17 extends w implements p<yq0.a, vq0.a, AttachmentNeedSmsResultFactory> {
        public static final AnonymousClass17 INSTANCE = new AnonymousClass17();

        AnonymousClass17() {
            super(2);
        }

        @Override // ym0.p
        public final AttachmentNeedSmsResultFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new AttachmentNeedSmsResultFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$18  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass18 extends w implements p<yq0.a, vq0.a, AttachmentFinishedFactory> {
        public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

        AnonymousClass18() {
            super(2);
        }

        @Override // ym0.p
        public final AttachmentFinishedFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new AttachmentFinishedFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentContactCustomerServiceFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/attachment/state/factory/AttachmentContactCustomerServiceFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$19  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass19 extends w implements p<yq0.a, vq0.a, AttachmentContactCustomerServiceFactory> {
        public static final AnonymousClass19 INSTANCE = new AnonymousClass19();

        AnonymousClass19() {
            super(2);
        }

        @Override // ym0.p
        public final AttachmentContactCustomerServiceFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new AttachmentContactCustomerServiceFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/api/session/SessionApi;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/api/session/SessionApi;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends w implements p<yq0.a, vq0.a, SessionApi> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // ym0.p
        public final SessionApi invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new RemoteSessionApi((HttpClientRepository) single.d(null, q0.b(HttpClientRepository.class), null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/setup2fa/state/factory/InitializationError2FASetupFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/setup2fa/state/factory/InitializationError2FASetupFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$20  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass20 extends w implements p<yq0.a, vq0.a, InitializationError2FASetupFactory> {
        public static final AnonymousClass20 INSTANCE = new AnonymousClass20();

        AnonymousClass20() {
            super(2);
        }

        @Override // ym0.p
        public final InitializationError2FASetupFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new InitializationError2FASetupFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedCode2FASetupFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/setup2fa/state/factory/NeedCode2FASetupFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$21  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass21 extends w implements p<yq0.a, vq0.a, NeedCode2FASetupFactory> {
        public static final AnonymousClass21 INSTANCE = new AnonymousClass21();

        AnonymousClass21() {
            super(2);
        }

        @Override // ym0.p
        public final NeedCode2FASetupFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedCode2FASetupFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$22  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass22 extends w implements p<yq0.a, vq0.a, NeedPhoneNumber2FASetupFactory> {
        public static final AnonymousClass22 INSTANCE = new AnonymousClass22();

        AnonymousClass22() {
            super(2);
        }

        @Override // ym0.p
        public final NeedPhoneNumber2FASetupFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedPhoneNumber2FASetupFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$23  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass23 extends w implements p<yq0.a, vq0.a, Registered2FASetupFactory> {
        public static final AnonymousClass23 INSTANCE = new AnonymousClass23();

        AnonymousClass23() {
            super(2);
        }

        @Override // ym0.p
        public final Registered2FASetupFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new Registered2FASetupFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$24  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass24 extends w implements p<yq0.a, vq0.a, Unregistered2FASetupFactory> {
        public static final AnonymousClass24 INSTANCE = new AnonymousClass24();

        AnonymousClass24() {
            super(2);
        }

        @Override // ym0.p
        public final Unregistered2FASetupFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new Unregistered2FASetupFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/sensitiveaction/factory/InitializationErrorSensitiveActionStateFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/sensitiveaction/factory/InitializationErrorSensitiveActionStateFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$25  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass25 extends w implements p<yq0.a, vq0.a, InitializationErrorSensitiveActionStateFactory> {
        public static final AnonymousClass25 INSTANCE = new AnonymousClass25();

        AnonymousClass25() {
            super(2);
        }

        @Override // ym0.p
        public final InitializationErrorSensitiveActionStateFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new InitializationErrorSensitiveActionStateFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$26  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass26 extends w implements p<yq0.a, vq0.a, NeedCode2FASensitiveActionFactory> {
        public static final AnonymousClass26 INSTANCE = new AnonymousClass26();

        AnonymousClass26() {
            super(2);
        }

        @Override // ym0.p
        public final NeedCode2FASensitiveActionFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedCode2FASensitiveActionFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$27  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass27 extends w implements p<yq0.a, vq0.a, NeedGoogleSignInInfoSensitiveActionStateFactory> {
        final /* synthetic */ ym0.a<Environment> $environment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass27(ym0.a<? extends Environment> aVar) {
            super(2);
            this.$environment = aVar;
        }

        @Override // ym0.p
        public final NeedGoogleSignInInfoSensitiveActionStateFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedGoogleSignInInfoSensitiveActionStateFactoryImpl(this.$environment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailResultSensitiveActionStateFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailResultSensitiveActionStateFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$28  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass28 extends w implements p<yq0.a, vq0.a, NeedMailResultSensitiveActionStateFactory> {
        public static final AnonymousClass28 INSTANCE = new AnonymousClass28();

        AnonymousClass28() {
            super(2);
        }

        @Override // ym0.p
        public final NeedMailResultSensitiveActionStateFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedMailResultSensitiveActionStateFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$29  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass29 extends w implements p<yq0.a, vq0.a, NeedMailSensitiveActionStateFactory> {
        final /* synthetic */ ym0.a<Environment> $environment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass29(ym0.a<? extends Environment> aVar) {
            super(2);
            this.$environment = aVar;
        }

        @Override // ym0.p
        public final NeedMailSensitiveActionStateFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedMailSensitiveActionStateFactoryImpl(this.$environment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/api/account/AccountApi;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/api/account/AccountApi;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends w implements p<yq0.a, vq0.a, AccountApi> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(2);
        }

        @Override // ym0.p
        public final AccountApi invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new RemoteAccountApi((HttpClientRepository) single.d(null, q0.b(HttpClientRepository.class), null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$30  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass30 extends w implements p<yq0.a, vq0.a, NeedPhoneNumberSensitiveActionStateFactory> {
        public static final AnonymousClass30 INSTANCE = new AnonymousClass30();

        AnonymousClass30() {
            super(2);
        }

        @Override // ym0.p
        public final NeedPhoneNumberSensitiveActionStateFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new NeedPhoneNumberSensitiveActionStateFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$31  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass31 extends w implements p<yq0.a, vq0.a, VerifiedSensitiveActionStateFactory> {
        public static final AnonymousClass31 INSTANCE = new AnonymousClass31();

        AnonymousClass31() {
            super(2);
        }

        @Override // ym0.p
        public final VerifiedSensitiveActionStateFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new VerifiedSensitiveActionStateFactoryImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/updateaccount/UpdateAccountService;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/updateaccount/UpdateAccountService;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$32  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass32 extends w implements p<yq0.a, vq0.a, UpdateAccountService> {
        public static final AnonymousClass32 INSTANCE = new AnonymousClass32();

        AnonymousClass32() {
            super(2);
        }

        @Override // ym0.p
        public final UpdateAccountService invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new UpdateAccountServiceImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/AuthenticationServiceImpl;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/AuthenticationServiceImpl;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$33  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass33 extends w implements p<yq0.a, vq0.a, AuthenticationServiceImpl> {
        public static final AnonymousClass33 INSTANCE = new AnonymousClass33();

        AnonymousClass33() {
            super(2);
        }

        @Override // ym0.p
        public final AuthenticationServiceImpl invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new AuthenticationServiceImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/recovery/RecoveryCodeService;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/recovery/RecoveryCodeService;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$34  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass34 extends w implements p<yq0.a, vq0.a, RecoveryCodeService> {
        public static final AnonymousClass34 INSTANCE = new AnonymousClass34();

        AnonymousClass34() {
            super(2);
        }

        @Override // ym0.p
        public final RecoveryCodeService invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new RecoveryCodeServiceImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/setup2fa/Setup2FAServiceImpl;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/setup2fa/Setup2FAServiceImpl;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$35  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass35 extends w implements p<yq0.a, vq0.a, Setup2FAServiceImpl> {
        public static final AnonymousClass35 INSTANCE = new AnonymousClass35();

        AnonymousClass35() {
            super(2);
        }

        @Override // ym0.p
        public final Setup2FAServiceImpl invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new Setup2FAServiceImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/removevirtualdevice/RemoveVirtualDeviceService;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/removevirtualdevice/RemoveVirtualDeviceService;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$36  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass36 extends w implements p<yq0.a, vq0.a, RemoveVirtualDeviceService> {
        public static final AnonymousClass36 INSTANCE = new AnonymousClass36();

        AnonymousClass36() {
            super(2);
        }

        @Override // ym0.p
        public final RemoveVirtualDeviceService invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new RemoveVirtualDeviceServiceImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/attachment/AttachmentServiceImpl;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/attachment/AttachmentServiceImpl;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$37  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass37 extends w implements p<yq0.a, vq0.a, AttachmentServiceImpl> {
        public static final AnonymousClass37 INSTANCE = new AnonymousClass37();

        AnonymousClass37() {
            super(2);
        }

        @Override // ym0.p
        public final AttachmentServiceImpl invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new AttachmentServiceImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/sensitiveaction/SensitiveActionServiceImpl;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/sensitiveaction/SensitiveActionServiceImpl;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$38  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass38 extends w implements p<yq0.a, vq0.a, SensitiveActionServiceImpl> {
        public static final AnonymousClass38 INSTANCE = new AnonymousClass38();

        AnonymousClass38() {
            super(2);
        }

        @Override // ym0.p
        public final SensitiveActionServiceImpl invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new SensitiveActionServiceImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "<name for destructuring parameter 0>", "Lv9/e;", "invoke", "(Lyq0/a;Lvq0/a;)Lv9/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$39  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass39 extends w implements p<yq0.a, vq0.a, e> {
        final /* synthetic */ e $baseLogger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass39(e eVar) {
            super(2);
            this.$baseLogger = eVar;
        }

        @Override // ym0.p
        public final e invoke(yq0.a factory, vq0.a aVar) {
            u.j(factory, "$this$factory");
            u.j(aVar, "<name for destructuring parameter 0>");
            String str = (String) aVar.a(q0.b(String.class));
            return str != null ? this.$baseLogger.g(str) : this.$baseLogger;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/api/auth/AuthApi;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/api/auth/AuthApi;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends w implements p<yq0.a, vq0.a, AuthApi> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(2);
        }

        @Override // ym0.p
        public final AuthApi invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new RemoteAuthApi((HttpClientRepository) single.d(null, q0.b(HttpClientRepository.class), null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/removevirtualdevice/api/virtualdevice/VirtualDeviceApi;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/removevirtualdevice/api/virtualdevice/VirtualDeviceApi;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$5  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass5 extends w implements p<yq0.a, vq0.a, VirtualDeviceApi> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(2);
        }

        @Override // ym0.p
        public final VirtualDeviceApi invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new RemoteVirtualDeviceApi((HttpClientRepository) single.d(null, q0.b(HttpClientRepository.class), null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$6  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass6 extends w implements p<yq0.a, vq0.a, SessionVerifier> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(2);
        }

        @Override // ym0.p
        public final SessionVerifier invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new RemoteSessionVerifier();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$7  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass7 extends w implements p<yq0.a, vq0.a, MultiSessionRetriever> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
            super(2);
        }

        @Override // ym0.p
        public final MultiSessionRetriever invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new RemoteMultiSessionRetriever();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$8  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass8 extends w implements p<yq0.a, vq0.a, LoggedInUpdaterService> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        AnonymousClass8() {
            super(2);
        }

        @Override // ym0.p
        public final LoggedInUpdaterService invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new LoggedInUpdaterServiceImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Koin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/a;", "Lvq0/a;", "it", "Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "invoke", "(Lyq0/a;Lvq0/a;)Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.di.KoinKt$commonModule$1$9  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass9 extends w implements p<yq0.a, vq0.a, LoggedOutFactory> {
        final /* synthetic */ ym0.a<Environment> $environment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass9(ym0.a<? extends Environment> aVar) {
            super(2);
            this.$environment = aVar;
        }

        @Override // ym0.p
        public final LoggedOutFactory invoke(yq0.a single, vq0.a it) {
            u.j(single, "$this$single");
            u.j(it, "it");
            return new LoggedOutFactoryImpl(this.$environment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KoinKt$commonModule$1(ym0.a<? extends Environment> aVar) {
        super(1);
        this.$environment = aVar;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(a module) {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        b bVar6;
        b bVar7;
        b bVar8;
        b bVar9;
        b bVar10;
        b bVar11;
        b bVar12;
        b bVar13;
        b bVar14;
        b bVar15;
        b bVar16;
        b bVar17;
        b bVar18;
        b bVar19;
        b bVar20;
        b bVar21;
        b bVar22;
        b bVar23;
        b bVar24;
        b bVar25;
        b bVar26;
        b bVar27;
        b bVar28;
        b bVar29;
        b bVar30;
        b bVar31;
        b bVar32;
        b bVar33;
        b bVar34;
        b bVar35;
        b bVar36;
        b bVar37;
        b bVar38;
        b bVar39;
        u.j(module, "$this$module");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        bVar = xq0.b.f107445e;
        Kind kind = Kind.f89818a;
        d<?> b10 = com.google.android.filament.utils.a.b(new rq0.a(bVar, q0.b(HttpClientRepository.class), anonymousClass1, kind), module);
        if (module.e()) {
            module.g(b10);
        }
        new c(module, b10);
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        bVar2 = xq0.b.f107445e;
        d<?> b11 = com.google.android.filament.utils.a.b(new rq0.a(bVar2, q0.b(SessionApi.class), anonymousClass2, kind), module);
        if (module.e()) {
            module.g(b11);
        }
        new c(module, b11);
        AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
        bVar3 = xq0.b.f107445e;
        d<?> b12 = com.google.android.filament.utils.a.b(new rq0.a(bVar3, q0.b(AccountApi.class), anonymousClass3, kind), module);
        if (module.e()) {
            module.g(b12);
        }
        new c(module, b12);
        AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
        bVar4 = xq0.b.f107445e;
        d<?> b13 = com.google.android.filament.utils.a.b(new rq0.a(bVar4, q0.b(AuthApi.class), anonymousClass4, kind), module);
        if (module.e()) {
            module.g(b13);
        }
        new c(module, b13);
        AnonymousClass5 anonymousClass5 = AnonymousClass5.INSTANCE;
        bVar5 = xq0.b.f107445e;
        d<?> b14 = com.google.android.filament.utils.a.b(new rq0.a(bVar5, q0.b(VirtualDeviceApi.class), anonymousClass5, kind), module);
        if (module.e()) {
            module.g(b14);
        }
        new c(module, b14);
        AnonymousClass6 anonymousClass6 = AnonymousClass6.INSTANCE;
        bVar6 = xq0.b.f107445e;
        d<?> b15 = com.google.android.filament.utils.a.b(new rq0.a(bVar6, q0.b(SessionVerifier.class), anonymousClass6, kind), module);
        if (module.e()) {
            module.g(b15);
        }
        new c(module, b15);
        AnonymousClass7 anonymousClass7 = AnonymousClass7.INSTANCE;
        bVar7 = xq0.b.f107445e;
        d<?> b16 = com.google.android.filament.utils.a.b(new rq0.a(bVar7, q0.b(MultiSessionRetriever.class), anonymousClass7, kind), module);
        if (module.e()) {
            module.g(b16);
        }
        new c(module, b16);
        AnonymousClass8 anonymousClass8 = AnonymousClass8.INSTANCE;
        bVar8 = xq0.b.f107445e;
        d<?> b17 = com.google.android.filament.utils.a.b(new rq0.a(bVar8, q0.b(LoggedInUpdaterService.class), anonymousClass8, kind), module);
        if (module.e()) {
            module.g(b17);
        }
        new c(module, b17);
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$environment);
        bVar9 = xq0.b.f107445e;
        d<?> b18 = com.google.android.filament.utils.a.b(new rq0.a(bVar9, q0.b(LoggedOutFactory.class), anonymousClass9, kind), module);
        if (module.e()) {
            module.g(b18);
        }
        new c(module, b18);
        AnonymousClass10 anonymousClass10 = AnonymousClass10.INSTANCE;
        bVar10 = xq0.b.f107445e;
        d<?> b19 = com.google.android.filament.utils.a.b(new rq0.a(bVar10, q0.b(LoggedInFactory.class), anonymousClass10, kind), module);
        if (module.e()) {
            module.g(b19);
        }
        new c(module, b19);
        AnonymousClass11 anonymousClass11 = AnonymousClass11.INSTANCE;
        bVar11 = xq0.b.f107445e;
        d<?> b21 = com.google.android.filament.utils.a.b(new rq0.a(bVar11, q0.b(NeedPhoneNumber2FACreationFactory.class), anonymousClass11, kind), module);
        if (module.e()) {
            module.g(b21);
        }
        new c(module, b21);
        AnonymousClass12 anonymousClass12 = AnonymousClass12.INSTANCE;
        bVar12 = xq0.b.f107445e;
        d<?> b22 = com.google.android.filament.utils.a.b(new rq0.a(bVar12, q0.b(NeedCode2FAFactory.class), anonymousClass12, kind), module);
        if (module.e()) {
            module.g(b22);
        }
        new c(module, b22);
        AnonymousClass13 anonymousClass13 = AnonymousClass13.INSTANCE;
        bVar13 = xq0.b.f107445e;
        d<?> b23 = com.google.android.filament.utils.a.b(new rq0.a(bVar13, q0.b(NeedAccountCreationFactory.class), anonymousClass13, kind), module);
        if (module.e()) {
            module.g(b23);
        }
        new c(module, b23);
        AnonymousClass14 anonymousClass14 = AnonymousClass14.INSTANCE;
        bVar14 = xq0.b.f107445e;
        d<?> b24 = com.google.android.filament.utils.a.b(new rq0.a(bVar14, q0.b(NeedMailResultFactory.class), anonymousClass14, kind), module);
        if (module.e()) {
            module.g(b24);
        }
        new c(module, b24);
        AnonymousClass15 anonymousClass15 = AnonymousClass15.INSTANCE;
        bVar15 = xq0.b.f107445e;
        d<?> b25 = com.google.android.filament.utils.a.b(new rq0.a(bVar15, q0.b(AttachmentBirthdayVerificationFactory.class), anonymousClass15, kind), module);
        if (module.e()) {
            module.g(b25);
        }
        new c(module, b25);
        AnonymousClass16 anonymousClass16 = AnonymousClass16.INSTANCE;
        bVar16 = xq0.b.f107445e;
        d<?> b26 = com.google.android.filament.utils.a.b(new rq0.a(bVar16, q0.b(AttachmentNeedMailResultFactory.class), anonymousClass16, kind), module);
        if (module.e()) {
            module.g(b26);
        }
        new c(module, b26);
        AnonymousClass17 anonymousClass17 = AnonymousClass17.INSTANCE;
        bVar17 = xq0.b.f107445e;
        d<?> b27 = com.google.android.filament.utils.a.b(new rq0.a(bVar17, q0.b(AttachmentNeedSmsResultFactory.class), anonymousClass17, kind), module);
        if (module.e()) {
            module.g(b27);
        }
        new c(module, b27);
        AnonymousClass18 anonymousClass18 = AnonymousClass18.INSTANCE;
        bVar18 = xq0.b.f107445e;
        d<?> b28 = com.google.android.filament.utils.a.b(new rq0.a(bVar18, q0.b(AttachmentFinishedFactory.class), anonymousClass18, kind), module);
        if (module.e()) {
            module.g(b28);
        }
        new c(module, b28);
        AnonymousClass19 anonymousClass19 = AnonymousClass19.INSTANCE;
        bVar19 = xq0.b.f107445e;
        d<?> b29 = com.google.android.filament.utils.a.b(new rq0.a(bVar19, q0.b(AttachmentContactCustomerServiceFactory.class), anonymousClass19, kind), module);
        if (module.e()) {
            module.g(b29);
        }
        new c(module, b29);
        AnonymousClass20 anonymousClass20 = AnonymousClass20.INSTANCE;
        bVar20 = xq0.b.f107445e;
        d<?> b31 = com.google.android.filament.utils.a.b(new rq0.a(bVar20, q0.b(InitializationError2FASetupFactory.class), anonymousClass20, kind), module);
        if (module.e()) {
            module.g(b31);
        }
        new c(module, b31);
        AnonymousClass21 anonymousClass21 = AnonymousClass21.INSTANCE;
        bVar21 = xq0.b.f107445e;
        d<?> b32 = com.google.android.filament.utils.a.b(new rq0.a(bVar21, q0.b(NeedCode2FASetupFactory.class), anonymousClass21, kind), module);
        if (module.e()) {
            module.g(b32);
        }
        new c(module, b32);
        AnonymousClass22 anonymousClass22 = AnonymousClass22.INSTANCE;
        bVar22 = xq0.b.f107445e;
        d<?> b33 = com.google.android.filament.utils.a.b(new rq0.a(bVar22, q0.b(NeedPhoneNumber2FASetupFactory.class), anonymousClass22, kind), module);
        if (module.e()) {
            module.g(b33);
        }
        new c(module, b33);
        AnonymousClass23 anonymousClass23 = AnonymousClass23.INSTANCE;
        bVar23 = xq0.b.f107445e;
        d<?> b34 = com.google.android.filament.utils.a.b(new rq0.a(bVar23, q0.b(Registered2FASetupFactory.class), anonymousClass23, kind), module);
        if (module.e()) {
            module.g(b34);
        }
        new c(module, b34);
        AnonymousClass24 anonymousClass24 = AnonymousClass24.INSTANCE;
        bVar24 = xq0.b.f107445e;
        d<?> b35 = com.google.android.filament.utils.a.b(new rq0.a(bVar24, q0.b(Unregistered2FASetupFactory.class), anonymousClass24, kind), module);
        if (module.e()) {
            module.g(b35);
        }
        new c(module, b35);
        AnonymousClass25 anonymousClass25 = AnonymousClass25.INSTANCE;
        bVar25 = xq0.b.f107445e;
        d<?> b36 = com.google.android.filament.utils.a.b(new rq0.a(bVar25, q0.b(InitializationErrorSensitiveActionStateFactory.class), anonymousClass25, kind), module);
        if (module.e()) {
            module.g(b36);
        }
        new c(module, b36);
        AnonymousClass26 anonymousClass26 = AnonymousClass26.INSTANCE;
        bVar26 = xq0.b.f107445e;
        d<?> b37 = com.google.android.filament.utils.a.b(new rq0.a(bVar26, q0.b(NeedCode2FASensitiveActionFactory.class), anonymousClass26, kind), module);
        if (module.e()) {
            module.g(b37);
        }
        new c(module, b37);
        AnonymousClass27 anonymousClass27 = new AnonymousClass27(this.$environment);
        bVar27 = xq0.b.f107445e;
        d<?> b38 = com.google.android.filament.utils.a.b(new rq0.a(bVar27, q0.b(NeedGoogleSignInInfoSensitiveActionStateFactory.class), anonymousClass27, kind), module);
        if (module.e()) {
            module.g(b38);
        }
        new c(module, b38);
        AnonymousClass28 anonymousClass28 = AnonymousClass28.INSTANCE;
        bVar28 = xq0.b.f107445e;
        d<?> b39 = com.google.android.filament.utils.a.b(new rq0.a(bVar28, q0.b(NeedMailResultSensitiveActionStateFactory.class), anonymousClass28, kind), module);
        if (module.e()) {
            module.g(b39);
        }
        new c(module, b39);
        AnonymousClass29 anonymousClass29 = new AnonymousClass29(this.$environment);
        bVar29 = xq0.b.f107445e;
        d<?> b41 = com.google.android.filament.utils.a.b(new rq0.a(bVar29, q0.b(NeedMailSensitiveActionStateFactory.class), anonymousClass29, kind), module);
        if (module.e()) {
            module.g(b41);
        }
        new c(module, b41);
        AnonymousClass30 anonymousClass30 = AnonymousClass30.INSTANCE;
        bVar30 = xq0.b.f107445e;
        d<?> b42 = com.google.android.filament.utils.a.b(new rq0.a(bVar30, q0.b(NeedPhoneNumberSensitiveActionStateFactory.class), anonymousClass30, kind), module);
        if (module.e()) {
            module.g(b42);
        }
        new c(module, b42);
        AnonymousClass31 anonymousClass31 = AnonymousClass31.INSTANCE;
        bVar31 = xq0.b.f107445e;
        d<?> b43 = com.google.android.filament.utils.a.b(new rq0.a(bVar31, q0.b(VerifiedSensitiveActionStateFactory.class), anonymousClass31, kind), module);
        if (module.e()) {
            module.g(b43);
        }
        new c(module, b43);
        AnonymousClass32 anonymousClass32 = AnonymousClass32.INSTANCE;
        bVar32 = xq0.b.f107445e;
        d<?> b44 = com.google.android.filament.utils.a.b(new rq0.a(bVar32, q0.b(UpdateAccountService.class), anonymousClass32, kind), module);
        if (module.e()) {
            module.g(b44);
        }
        new c(module, b44);
        AnonymousClass33 anonymousClass33 = AnonymousClass33.INSTANCE;
        bVar33 = xq0.b.f107445e;
        d<?> b45 = com.google.android.filament.utils.a.b(new rq0.a(bVar33, q0.b(AuthenticationServiceImpl.class), anonymousClass33, kind), module);
        if (module.e()) {
            module.g(b45);
        }
        o.b(new c(module, b45), new fn0.d[]{q0.b(AuthenticationService.class), q0.b(MutableAuthenticationService.class)});
        AnonymousClass34 anonymousClass34 = AnonymousClass34.INSTANCE;
        bVar34 = xq0.b.f107445e;
        d<?> b46 = com.google.android.filament.utils.a.b(new rq0.a(bVar34, q0.b(RecoveryCodeService.class), anonymousClass34, kind), module);
        if (module.e()) {
            module.g(b46);
        }
        new c(module, b46);
        AnonymousClass35 anonymousClass35 = AnonymousClass35.INSTANCE;
        bVar35 = xq0.b.f107445e;
        d<?> b47 = com.google.android.filament.utils.a.b(new rq0.a(bVar35, q0.b(Setup2FAServiceImpl.class), anonymousClass35, kind), module);
        if (module.e()) {
            module.g(b47);
        }
        o.b(new c(module, b47), new fn0.d[]{q0.b(Setup2FAService.class), q0.b(MutableSetup2FAService.class)});
        AnonymousClass36 anonymousClass36 = AnonymousClass36.INSTANCE;
        bVar36 = xq0.b.f107445e;
        d<?> b48 = com.google.android.filament.utils.a.b(new rq0.a(bVar36, q0.b(RemoveVirtualDeviceService.class), anonymousClass36, kind), module);
        if (module.e()) {
            module.g(b48);
        }
        new c(module, b48);
        AnonymousClass37 anonymousClass37 = AnonymousClass37.INSTANCE;
        bVar37 = xq0.b.f107445e;
        d<?> b49 = com.google.android.filament.utils.a.b(new rq0.a(bVar37, q0.b(AttachmentServiceImpl.class), anonymousClass37, kind), module);
        if (module.e()) {
            module.g(b49);
        }
        o.b(new c(module, b49), new fn0.d[]{q0.b(AttachmentService.class), q0.b(MutableAttachmentService.class)});
        AnonymousClass38 anonymousClass38 = AnonymousClass38.INSTANCE;
        bVar38 = xq0.b.f107445e;
        d<?> b51 = com.google.android.filament.utils.a.b(new rq0.a(bVar38, q0.b(SensitiveActionServiceImpl.class), anonymousClass38, kind), module);
        if (module.e()) {
            module.g(b51);
        }
        o.b(new c(module, b51), new fn0.d[]{q0.b(SensitiveActionService.class), q0.b(MutableSensitiveActionService.class)});
        AnonymousClass39 anonymousClass39 = new AnonymousClass39(new e(new h(x.V(new v9.c()), 1), "Authentication"));
        bVar39 = xq0.b.f107445e;
        sq0.b<?> bVar40 = new sq0.b<>(new rq0.a(bVar39, q0.b(e.class), anonymousClass39, Kind.f89819b));
        module.f(bVar40);
        new c(module, bVar40);
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(a aVar) {
        invoke2(aVar);
        return y.f85009a;
    }
}
