package com.withings.library.authentication.api.account;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.api.account.serializers.BooleanSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: AccountContext.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/library/authentication/api/account/Subscribed.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/library/authentication/api/account/Subscribed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/library/authentication/api/account/Subscribed;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/library/authentication/api/account/Subscribed;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Subscribed$$serializer implements GeneratedSerializer<Subscribed> {
    public static final Subscribed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Subscribed$$serializer subscribed$$serializer = new Subscribed$$serializer();
        INSTANCE = subscribed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.library.authentication.api.account.Subscribed", subscribed$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("discount", true);
        pluginGeneratedSerialDescriptor.addElement("newsletter", true);
        pluginGeneratedSerialDescriptor.addElement(ConstantsWs.WELLNESS_TASK_TYPE_SURVEY, true);
        pluginGeneratedSerialDescriptor.addElement("study", true);
        pluginGeneratedSerialDescriptor.addElement("report", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.NOTIFICATION, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Subscribed$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Subscribed deserialize(Decoder decoder) {
        int i11;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i12 = 5;
        Boolean bool7 = null;
        if (beginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            bool6 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 5, booleanSerializer, null);
            i11 = 63;
            bool4 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 3, booleanSerializer, null);
            bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, booleanSerializer, null);
            bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 2, booleanSerializer, null);
            bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 1, booleanSerializer, null);
            bool = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 0, booleanSerializer, null);
        } else {
            boolean z5 = true;
            int i13 = 0;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i12 = 5;
                    case 0:
                        bool7 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 0, BooleanSerializer.INSTANCE, bool7);
                        i13 |= 1;
                        i12 = 5;
                    case 1:
                        bool8 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 1, BooleanSerializer.INSTANCE, bool8);
                        i13 |= 2;
                    case 2:
                        bool9 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, bool9);
                        i13 |= 4;
                    case 3:
                        bool10 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 3, BooleanSerializer.INSTANCE, bool10);
                        i13 |= 8;
                    case 4:
                        bool11 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, bool11);
                        i13 |= 16;
                    case 5:
                        bool12 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, i12, BooleanSerializer.INSTANCE, bool12);
                        i13 |= 32;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i13;
            bool = bool7;
            bool2 = bool8;
            bool3 = bool9;
            bool4 = bool10;
            bool5 = bool11;
            bool6 = bool12;
        }
        beginStructure.endStructure(descriptor2);
        return new Subscribed(i11, bool, bool2, bool3, bool4, bool5, bool6, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Subscribed value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        Subscribed.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
