package com.withings.wiscale2.device.wpa.wpa02.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
/* compiled from: WppCartridgeDeviceException.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "BeingActivated", "CleansingInProgressError", "InvalidException", "LowBatteryError", "MeasureInProgressError", "NotActivated", "NotAuthenticatedException", "NotInstalled", "UnknownError", "UnreadableException", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$BeingActivated;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$CleansingInProgressError;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$InvalidException;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$LowBatteryError;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$MeasureInProgressError;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$NotActivated;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$NotAuthenticatedException;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$NotInstalled;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$UnknownError;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$UnreadableException;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class WppCartridgeDeviceException extends Exception {

    /* renamed from: b  reason: collision with root package name */
    private static final List<WppCartridgeDeviceException> f55075b = x.W(UnreadableException.f55086c, NotInstalled.f55084c, InvalidException.f55079c, NotAuthenticatedException.f55083c, NotActivated.f55082c, BeingActivated.f55077c, LowBatteryError.f55080c, MeasureInProgressError.f55081c, CleansingInProgressError.f55078c, UnknownError.f55085c);

    /* renamed from: a  reason: collision with root package name */
    private final Short f55076a;

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$BeingActivated;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class BeingActivated extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final BeingActivated f55077c = new BeingActivated();

        private BeingActivated() {
            super((short) 5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BeingActivated)) {
                return false;
            }
            BeingActivated beingActivated = (BeingActivated) obj;
            return true;
        }

        public final int hashCode() {
            return -1262625448;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "BeingActivated";
        }
    }

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$CleansingInProgressError;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class CleansingInProgressError extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final CleansingInProgressError f55078c = new CleansingInProgressError();

        private CleansingInProgressError() {
            super((short) 64);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CleansingInProgressError)) {
                return false;
            }
            CleansingInProgressError cleansingInProgressError = (CleansingInProgressError) obj;
            return true;
        }

        public final int hashCode() {
            return -946672316;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "CleansingInProgressError";
        }
    }

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$InvalidException;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class InvalidException extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final InvalidException f55079c = new InvalidException();

        private InvalidException() {
            super((short) 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidException)) {
                return false;
            }
            InvalidException invalidException = (InvalidException) obj;
            return true;
        }

        public final int hashCode() {
            return -2118776802;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InvalidException";
        }
    }

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$LowBatteryError;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class LowBatteryError extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final LowBatteryError f55080c = new LowBatteryError();

        private LowBatteryError() {
            super((short) 4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LowBatteryError)) {
                return false;
            }
            LowBatteryError lowBatteryError = (LowBatteryError) obj;
            return true;
        }

        public final int hashCode() {
            return -1071238999;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "LowBatteryError";
        }
    }

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$MeasureInProgressError;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class MeasureInProgressError extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final MeasureInProgressError f55081c = new MeasureInProgressError();

        private MeasureInProgressError() {
            super((short) 16);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MeasureInProgressError)) {
                return false;
            }
            MeasureInProgressError measureInProgressError = (MeasureInProgressError) obj;
            return true;
        }

        public final int hashCode() {
            return 1173089534;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "MeasureInProgressError";
        }
    }

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$NotActivated;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class NotActivated extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final NotActivated f55082c = new NotActivated();

        private NotActivated() {
            super((short) 4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotActivated)) {
                return false;
            }
            NotActivated notActivated = (NotActivated) obj;
            return true;
        }

        public final int hashCode() {
            return -1571916988;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NotActivated";
        }
    }

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$NotAuthenticatedException;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class NotAuthenticatedException extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final NotAuthenticatedException f55083c = new NotAuthenticatedException();

        private NotAuthenticatedException() {
            super(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotAuthenticatedException)) {
                return false;
            }
            NotAuthenticatedException notAuthenticatedException = (NotAuthenticatedException) obj;
            return true;
        }

        public final int hashCode() {
            return 693504589;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NotAuthenticatedException";
        }
    }

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$NotInstalled;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class NotInstalled extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final NotInstalled f55084c = new NotInstalled();

        private NotInstalled() {
            super((short) 256);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotInstalled)) {
                return false;
            }
            NotInstalled notInstalled = (NotInstalled) obj;
            return true;
        }

        public final int hashCode() {
            return -1747263251;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NotInstalled";
        }
    }

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$UnknownError;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class UnknownError extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final UnknownError f55085c = new UnknownError();

        private UnknownError() {
            super(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownError)) {
                return false;
            }
            UnknownError unknownError = (UnknownError) obj;
            return true;
        }

        public final int hashCode() {
            return 1070992100;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnknownError";
        }
    }

    /* compiled from: WppCartridgeDeviceException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException$UnreadableException;", "Lcom/withings/wiscale2/device/wpa/wpa02/model/WppCartridgeDeviceException;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class UnreadableException extends WppCartridgeDeviceException {

        /* renamed from: c  reason: collision with root package name */
        public static final UnreadableException f55086c = new UnreadableException();

        private UnreadableException() {
            super((short) 2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnreadableException)) {
                return false;
            }
            UnreadableException unreadableException = (UnreadableException) obj;
            return true;
        }

        public final int hashCode() {
            return 1844868864;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnreadableException";
        }
    }

    public /* synthetic */ WppCartridgeDeviceException() {
        this(null);
    }

    public final Short b() {
        return this.f55076a;
    }

    public WppCartridgeDeviceException(Short sh2) {
        this.f55076a = sh2;
    }
}
