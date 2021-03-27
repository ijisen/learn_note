import React from "react";
import { connect } from "react-redux";
import { Button  } from 'antd';
import { setFilter } from "@/store/actions";
import { VISIBILITY_FILTERS } from "./constants";

const VisibilityFilters = ({ activeFilter, setFilter }) => {
  return (
    <div className="visibility-filters">
      {Object.keys(VISIBILITY_FILTERS).map(filterKey => {
        const currentFilter = VISIBILITY_FILTERS[filterKey];
        return (
          <Button
            key={`visibility-filter-${currentFilter}`}
            className="mll"
            onClick={() => {
              setFilter(currentFilter);
            }}
          >
            {currentFilter}
          </Button>
        );
      })}
    </div>
  );
};

const mapStateToProps = state => {
  return { activeFilter: state.visibilityFilter };
};
export default connect(
  mapStateToProps,
  { setFilter }
)(VisibilityFilters);
