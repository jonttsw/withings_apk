package com.withings.programs.model.webservice.enrolledProgram;

import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import java.util.List;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/* compiled from: WsEnrolledPrograms.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsEnrolledPrograms$$serializer implements GeneratedSerializer<WsEnrolledPrograms> {
    public static final WsEnrolledPrograms$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsEnrolledPrograms$$serializer wsEnrolledPrograms$$serializer = new WsEnrolledPrograms$$serializer();
        INSTANCE = wsEnrolledPrograms$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.enrolledProgram.WsEnrolledPrograms", wsEnrolledPrograms$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("programs", false);
        pluginGeneratedSerialDescriptor.addElement(GetHealthAttributeResponse.FIELD_HAS_MORE_NAME, false);
        pluginGeneratedSerialDescriptor.addElement(GetHealthAttributeResponse.FIELD_OFFSET_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("modifiedInSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsEnrolledPrograms$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = WsEnrolledPrograms.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsEnrolledPrograms deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        boolean z5;
        int i11;
        List list;
        Integer num;
        Long l5;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = WsEnrolledPrograms.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 1);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            z5 = decodeBooleanElement;
            l5 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 3, LongSerializer.INSTANCE, null);
            num = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, null);
            i11 = 15;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            List list2 = null;
            Integer num2 = null;
            Long l6 = null;
            int i12 = 0;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], list2);
                    i12 |= 1;
                } else if (decodeElementIndex == 1) {
                    z12 = beginStructure.decodeBooleanElement(descriptor2, 1);
                    i12 |= 2;
                } else if (decodeElementIndex == 2) {
                    num2 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, num2);
                    i12 |= 4;
                } else if (decodeElementIndex != 3) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    l6 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 3, LongSerializer.INSTANCE, l6);
                    i12 |= 8;
                }
            }
            z5 = z12;
            i11 = i12;
            list = list2;
            num = num2;
            l5 = l6;
        }
        beginStructure.endStructure(descriptor2);
        return new WsEnrolledPrograms(i11, list, z5, num, l5, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsEnrolledPrograms value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsEnrolledPrograms.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
