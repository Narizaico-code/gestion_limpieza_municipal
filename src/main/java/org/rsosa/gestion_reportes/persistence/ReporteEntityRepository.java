package org.rsosa.gestion_reportes.persistence;


import org.rsosa.gestion_reportes.dominio.dto.ReporteDto;
import org.rsosa.gestion_reportes.dominio.exception.ReporteNoExisteException;
import org.rsosa.gestion_reportes.dominio.repository.ReporteRepository;
import org.rsosa.gestion_reportes.persistence.crud.CrudReporteEntity;
import org.rsosa.gestion_reportes.persistence.entity.Reporte;
import org.rsosa.gestion_reportes.web.mapper.ReporteMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReporteEntityRepository implements ReporteRepository{
    private final CrudReporteEntity crudReporteEntity;
    private final ReporteMapper reporteMapper;

    public ReporteEntityRepository(CrudReporteEntity crudReporteEntity, ReporteMapper reporteMapper) {
        this.crudReporteEntity = crudReporteEntity;
        this.reporteMapper = reporteMapper;
    }

    @Override
    public List<ReporteDto> obtenerTodo() {
        return this.reporteMapper.toDto(this.crudReporteEntity.findAll());
    }

    @Override
    public List<ReporteDto> obtenerReportesPorVecino(String vecino) {
        return this.reporteMapper.toDto(this.crudReporteEntity.findAllByVecino(vecino));
    }

    @Override
    public List<ReporteDto> obtenerReportesPorEstado(String estado) {
        return this.reporteMapper.toDto(this.crudReporteEntity.findAllByEstado(estado));
    }

    @Override
    public List<ReporteDto> obtenerReportesPorTipoReporte(String tipoReporte) {
        return this.reporteMapper.toDto(this.crudReporteEntity.findAllByTipoReporte(tipoReporte));
    }

    @Override
    public List<ReporteDto> obtenerReportesPorPersonal(String persona) {
        return this.reporteMapper.toDto(this.crudReporteEntity.findAllByPersonalAsignado(persona));
    }

    @Override
    public ReporteDto obtenerReportePorCodigo(Long id) {
        Reporte reporte = this.crudReporteEntity.findById(id).orElse(null);
        if (reporte == null){
            throw new ReporteNoExisteException(id);
        }
        return this.reporteMapper.toDto(reporte);
    }

    @Override
    public ReporteDto guardarReporte(ReporteDto reporteDto) {
        String nombre = String.valueOf(reporteDto.staff());
        Reporte reporte = this.crudReporteEntity.findById()
        return null;
    }

    @Override
    public ReporteDto actualizarReporte(Long id, ReporteDto reporteDto) {
        return null;
    }

    @Override
    public void eliminarReporte(Long id) {

    }
}