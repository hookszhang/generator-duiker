package <%= groupCases.splitByDot %>.<%= nameCases.splitByDot %>.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import <%= groupCases.splitByDot %>.<%= nameCases.splitByDot %>.model.<%= entityClass %>

interface <%= entityClass %>Mapper : BaseMapper<<%= entityClass %>> {
}
