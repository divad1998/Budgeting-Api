package com.budgit.map;

import com.budgit.dto.BudgetDTO;
import com.budgit.table.Budget;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import reactor.core.publisher.Mono;

/**
 *
 * maps BudgetDTO to Budget and vice versa
 */
public class Mapper {

    /**
     *
     * essentially maps BudgetDTO to Budget
     * @return resulting budget
     */
    public Budget toBudget(BudgetDTO budgetDTO) {
                    Budget budget = new Budget();
                    budget.setMonthh(budgetDTO.getMonthh());
                    budget.setIncome(budgetDTO.getIncome());
                    budget.setBalance(budgetDTO.getBalance());
                    if (budgetDTO.getCreatedAt() != null)  {
                        budget.setCreatedAt(budgetDTO.getCreatedAt());
                    }

                    return budget;
    }

    /**
     *
     * essentially maps Budget to BudgetDTO
     * @return resulting budgetDTO
     */
    public BudgetDTO toBudgetDTO(Budget budget) {
        BudgetDTO budgetDTO = new BudgetDTO();
        budgetDTO.setId(budget.getId());
        budgetDTO.setMonthh(budget.getMonthh());
        budgetDTO.setIncome(budget.getIncome());
        budgetDTO.setBalance(budget.getBalance());
        budgetDTO.setCreatedAt(budget.getCreatedAt());

        return budgetDTO;
    }
}
